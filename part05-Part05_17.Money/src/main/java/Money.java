
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        Money m1 = new Money(this.euros+addition.euros,this.cents+addition.cents);
        return m1;
    }
    public boolean lessThan(Money compared){
        if(this.euros<compared.euros()){
            return true;
        }else if(this.euros==compared.euros()){
            if(this.cents<compared.cents()){
            return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser){
        int euors1 = this.euros - decreaser.euros();
        int cents1 = this.cents - decreaser.cents();
        if(cents1<0 || euors1<0){
            euors1 = euors1-1;
            if(euors1<0){
                return new Money(0,0);
            } else {
                cents1 = 100-decreaser.cents();
            }
            
        }
        Money m1 = new Money(euors1,cents1);
        return m1;
    }
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
