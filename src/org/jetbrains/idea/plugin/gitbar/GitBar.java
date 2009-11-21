package org.jetbrains.idea.plugin.gitbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import org.jetbrains.annotations.NotNull;

import java.util.ResourceBundle;

/**
 * git bar component
 *
 * @author linux_china@hotmail.com
 */
public class GitBar implements ApplicationComponent {
    public static final ResourceBundle BUNDLE = ResourceBundle.getBundle("org/jetbrains/idea/plugin/gitbar/resource/action-map");

    @NotNull
    public String getComponentName() {
        return "Git Bar";
    }

    public void initComponent() {
    }

    public void disposeComponent() {
    }

    /**
     * is visible
     *
     * @param anAction action
     * @param project  project
     * @return visible mark
     */
    public boolean isVisible(AnAction anAction, Project project) {
        return isGit(project);
    }

    /**
     * project's vcs is git
     *
     * @param project project
     * @return git vcs
     */
    private boolean isGit(Project project) {
        if (project == null)
            return false;
        ProjectLevelVcsManager vcsManager = ProjectLevelVcsManager.getInstance(project);
        if (vcsManager == null)
            return false;
        AbstractVcs abstractVcss[] = vcsManager.getAllActiveVcss();
        if (abstractVcss == null)
            return false;
        int i = 0;
        while (i < abstractVcss.length) {
            AbstractVcs abstractVcs = abstractVcss[i];
            if ("GIT".equalsIgnoreCase(abstractVcs.getName()))
                return true;
            i++;
        }
        return false;
    }

}
