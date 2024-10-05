
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance(){
        if(this.day<=29){
            this.day = this.day+1;
        } else{
            this.day = 01;
            if(this.month<=11){
                this.month = this.month+1;
            } else {
                this.month =01;
                this.year = this.year+1;
            }
        }  
    }
    
    public void advance(int howManyDays){
        if(this.day<=30-howManyDays){
            this.day = this.day+howManyDays;
        } else{
            this.day = Math.abs(howManyDays);
            if(this.month<=11){
                this.month = this.month+((howManyDays)/30)+1;
            } else {
                this.month = ((howManyDays)/30)+1;
                this.year = this.year+((howManyDays)/365)+1;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate date1 = new SimpleDate(this.day,this.month,this.year);
        date1.advance(days);
        return date1;  
    }
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
