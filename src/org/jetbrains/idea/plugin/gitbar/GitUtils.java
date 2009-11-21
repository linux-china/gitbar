package org.jetbrains.idea.plugin.gitbar;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.ApplicationManager;

/**
 * Utility class
 *
 * @author linux_china@hotmail.com
 */
public class GitUtils {
    /**
     * get project
     *
     * @param actionEvent action event
     * @return project
     */
    public static Project getProject(AnActionEvent actionEvent) {
        return (Project) actionEvent.getDataContext().getData("project");
    }

    /**
     * get git bar component
     *
     * @return gitBar component
     */
    public static GitBar getGitBar() {
        return ApplicationManager.getApplication().getComponent(GitBar.class);
    }
}
