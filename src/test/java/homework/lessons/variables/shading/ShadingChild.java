package homework.lessons.variables.shading;

import org.testng.annotations.Test;

public class ShadingChild extends ShadingParent {

    String folderName = "Child";

    ShadingGeneral shadingGeneral = new ShadingGeneral();

    @Test
    public void execute() {
        this.showName();
        super.showName();
        shadingGeneral.showName();
    }

    public void showName() {
        System.out.println(folderName);
    }
}
