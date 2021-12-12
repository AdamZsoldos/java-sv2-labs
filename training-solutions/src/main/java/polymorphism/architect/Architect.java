package polymorphism.architect;

import java.util.List;

public class Architect {

    public static void main(String[] args) {
        List<Plan> plans = List.of(
                new SketchPlan(10, "Sketch plan"),
                new PermitPlan(10, "Permit plan", "John Doe", "1200 Example Way"),
                new ConstructionPlan(10, "Construction plan", "John Doe", "1200 Example Way", 20)
        );

        List<SketchPlan> sketchPlans = List.of(
                new SketchPlan(10, "Sketch plan"),
                new PermitPlan(10, "Permit plan", "John Doe", "1200 Example Way"),
                new ConstructionPlan(10, "Construction plan", "John Doe", "1200 Example Way", 20)
        );

        List<Header> headers = List.of(
                new PermitPlan(10, "Permit plan", "John Doe", "1200 Example Way"),
                new ConstructionPlan(10, "Construction plan", "John Doe", "1200 Example Way", 20)
        );

        List<PermitPlan> permitPlans = List.of(
                new PermitPlan(10, "Permit plan", "John Doe", "1200 Example Way"),
                new ConstructionPlan(10, "Construction plan", "John Doe", "1200 Example Way", 20)
        );

        List<ConstructionPlan> constructionPlans = List.of(
                new ConstructionPlan(10, "Construction plan", "John Doe", "1200 Example Way", 20)
        );

        for (Plan plan : plans) {
            System.out.println();
            System.out.println(plan.getPagesOfDocumentation());
        }

        for (SketchPlan sketchPlan : sketchPlans) {
            System.out.println();
            System.out.println(sketchPlan.getPagesOfDocumentation());
            System.out.println(sketchPlan.getTitle());
        }

        for (Header header : headers) {
            System.out.println();
            System.out.println(header.getNameOfClient());
            System.out.println(header.getAddressOfBuilding());
        }

        for (PermitPlan permitPlan : permitPlans) {
            System.out.println();
            System.out.println(permitPlan.getPagesOfDocumentation());
            System.out.println(permitPlan.getTitle());
            System.out.println(permitPlan.getNameOfClient());
            System.out.println(permitPlan.getAddressOfBuilding());
            System.out.println(permitPlan.getHeader());
        }

        for (ConstructionPlan constructionPlan : constructionPlans) {
            System.out.println();
            System.out.println(constructionPlan.getPagesOfDocumentation());
            System.out.println(constructionPlan.getTitle());
            System.out.println(constructionPlan.getNameOfClient());
            System.out.println(constructionPlan.getAddressOfBuilding());
            System.out.println(constructionPlan.getHeader());
            System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        }
    }
}
