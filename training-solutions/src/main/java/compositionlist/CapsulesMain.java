package compositionlist;

public class CapsulesMain {

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        System.out.println(capsules.getColors());

        capsules.addLast("red");
        capsules.addLast("blue");
        capsules.addLast("brown");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());

        capsules.addFirst("yellow");
        capsules.addFirst("purple");
        capsules.addLast("green");
        System.out.println(capsules.getColors());
    }
}
