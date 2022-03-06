package UpcastingDowncasting.quiz.ex01;

//TODO Se da urmatoarea ierarhie simplista de copaci. Ce output se va afisa la executia metodei statice movementSound() pentru fiecare obiect creat in metoda main?



public class Test {
    public static void main(String[] args) {
        Tree tree1 = new AppleTree(100, "Summerfree", 6.3, 80, true); // Upcasting -> cream un obiect AppleTree care este referit prin clasa parinte Tree
        Tree tree2 = new Tree(40, "Generic tree", 8.2); // tree object created referred by Tree
        AppleTree tree3 = new AppleTree(80, "Sirius", 4.4, 55, false);  //AppleTre object created reffered by AppleTree

        // movementSound() este o metoda statica -> la suprascriere : intotdeauna se ia implementarea din obiect, mai putin pentru metodele statice
        // la metodele statice luam implementarea din clasa, identificam clasa dupa referinta !


        tree1.movementSound();  // apelam o metoda statica din tree !
        tree2.movementSound();  // apelam tot metoda statica din tree
        tree3.movementSound(); // avand o referinta de tipul AppleTree vom apleca metoda movementSound() din clasa AppleTree
    }
}



