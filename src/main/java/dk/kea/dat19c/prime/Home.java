package dk.kea.dat19c.prime;

import dk.kea.dat19c.prime.Service.Prime;

public class Home {
    public static void main(String[] args) {
        Prime p = new Prime();


        p.primeIterative(2);
        p.primeIterative(8);
        p.primeIterative(27);
        p.primeIterative(113);
        p.primeIterative(117);

        p.primeDivisorsRecursive(2);
        p.primeDivisorsRecursive(8);
        p.primeDivisorsRecursive(27);
        p.primeDivisorsRecursive(41);
        p.primeDivisorsRecursive(113);
        p.primeDivisorsRecursive(117);
        p.primeDivisorsRecursive(141);
        p.primeDivisorsRecursive(143);
    }
}
