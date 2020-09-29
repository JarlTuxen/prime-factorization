package dk.kea.dat19c.prime;

import dk.kea.dat19c.prime.Service.Prime;

public class Home {
    public static void main(String[] args) {
        Prime p = new Prime();


        p.prime(2);
        p.prime(8);
        p.prime(27);
        p.prime(113);
        p.prime(117);

        //p.primeRec(2);
        //p.primeRec(8);

        p.primeDivisors(2);
        p.primeDivisors(8);
        p.primeDivisors(27);
        p.primeDivisors(41);
        p.primeDivisors(113);
        p.primeDivisors(117);
        p.primeDivisors(141);
        p.primeDivisors(143);
    }
}
