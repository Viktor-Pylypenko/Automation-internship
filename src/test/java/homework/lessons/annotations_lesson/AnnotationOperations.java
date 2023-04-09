package homework.lessons.annotations_lesson;

import annotations.InitService;
import annotations.Service;
import jdk.jfr.Description;

public class AnnotationOperations {

    @Description("the power of an engine")
    public static int i = 4;

    public static void main(String[] args) {
        inspectService(InitService.class);
        inspectService(String.class);

    }

    public static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
        } else {
            System.out.println("Annotation not found");
        }
    }
}
