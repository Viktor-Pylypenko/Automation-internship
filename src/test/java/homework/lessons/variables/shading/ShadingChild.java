package homework.lessons.variables.shading;

import org.testng.annotations.Test;

public class ShadingChild extends ShadingParent {

    String folderName = "Child";

    ShadingGeneral shadingGeneral = new ShadingGeneral();

    @Test
    public void execute() {
        System.out.println(this.folderName);
        System.out.println(super.folderName);
        System.out.println(shadingGeneral.folderName);
    }

}
