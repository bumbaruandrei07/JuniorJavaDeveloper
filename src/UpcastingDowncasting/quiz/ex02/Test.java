package UpcastingDowncasting.quiz.ex02;


// TODO -> In continuare, se definesc metodele-pereche hashCode() si equals(Object) pentru fiecare clasa implementata anterior. Ce rezultate vor produce urmatoarele expresii?

public class Test {
    public static void main(String[] args) {
        Tree tree1 = new AppleTree(100, "Summerfree", 6.3, 80, true);
        Tree tree2 = new AppleTree(100, "Summerfree", 6.3, 90, true);
        AppleTree tree3 = (AppleTree) tree2;
        Tree tree4 = new AppleTree(100, "Summerfree", 6.3, 90, true);

        System.out.println(tree1.equals(tree2));  // false
        System.out.println(tree2 == tree4);  // nu foloseste equals -> cu == comparam referinte (adrese), tree2 si tree4 prin vor fi egale (prin ==) daca sunt referinte la acelasi obiect, nu daca au aceleasi field-uri!
        //tree2 este referinta la obiectul AppleTree, tree4 este o referinta la un alt AppleTree
        // Raspuns : False !
        System.out.println(tree3.equals(tree4)); //tree3 este o referinta la obiectul tree2 prin downcasting explicit , tree4 este obiectul AppleTree
        // Raspuns : True, pentru ca el verifica toate fieldurile in equals mai putin isBio, care nu sunt egale(false in tree2 si true in tree4) dar in equals nu se face aceasta verificare
        // orice instanta este o instanta a tuturor superclaselor, invers nu (Relatia Generic vs Specific)


        // ANOTHER EXERCISE:

        Tree treeA = new AppleTree(100, "Summerfree", 6.3, 80, true);
        Tree treeB = new Tree(100, "Summerfree", 6.3);
        AppleTree treeC = new AppleTree(100, "Melba", 12.8, 141, false);

        System.out.println(treeA.toString()); //referinta de tipul tree catre un obiect de tipul AppleTree, afiseaza din AppleTree, metoda nu e statica.
        System.out.println(treeB); //treeB este o referinta de tipul Tree ( Tree treeB ) la un obiect de tipul Tree (100, "Summerfree", 6.3); -> apeleaza metoda din Tree
        treeC.toString(); //apeleaza toString(), dar nu-l afiseaza, corect era:
        System.out.println(treeC.toString());




    }
}