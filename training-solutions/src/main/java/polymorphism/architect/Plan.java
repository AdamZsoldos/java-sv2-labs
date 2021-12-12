package polymorphism.architect;

public abstract class Plan {

    protected final int pagesOfDocumentation;

    protected Plan(int pagesOfDocumentation) {
        this.pagesOfDocumentation = pagesOfDocumentation;
    }

    public abstract int getPagesOfDocumentation();
}
