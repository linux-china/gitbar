package org.jetbrains.idea.plugin.gitbar.action;

import com.intellij.openapi.actionSystem.ActionManager;
import org.jetbrains.idea.plugin.gitbar.GitBar;

import javax.swing.*;

/**
 * default git action
 *
 * @author linux_china@hotmail.com
 */
public class DefaultGitAction extends BasicProxyAction {

    /**
     * constructor
     */
    public DefaultGitAction() {
    }

    /**
     * constructor
     *
     * @param text action text
     */
    public DefaultGitAction(String text) {
        super(text);
    }

    /**
     * constructor
     *
     * @param text        action text
     * @param description action description
     * @param icon        action icon
     */
    public DefaultGitAction(String text, String description, Icon icon) {
        super(text, description, icon);
    }

    /**
     * get action id
     *
     * @return action id
     */
    protected String getActionId() {
        String s = ActionManager.getInstance().getId(this);
        return GitBar.BUNDLE.getString(s);
    }

}
