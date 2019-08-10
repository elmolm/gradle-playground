package blog.elmland.gradle;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.JavaLibraryPlugin;
import org.gradle.language.java.plugins.JavaLanguagePlugin;

public class ExtendedJavaLibraryPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getPluginManager().apply(JavaLibraryPlugin.class);

        project.getTasks().register("javaVersion", task -> {
            task.setGroup("Help");
            task.setDescription("Get the java version");
            task.doLast(s -> System.out.println("Java version " + System.getProperty("java.version")));
        });
    }
}
