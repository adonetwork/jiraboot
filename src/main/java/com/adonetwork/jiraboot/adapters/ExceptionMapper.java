package com.adonetwork.jiraboot.adapters;

import com.adonetwork.jiraboot.core.JiraBootException;
import com.adonetwork.jiraboot.external.JiraErrorMessage;
import com.adonetwork.jiraboot.external.JiraMessageException;

public final class ExceptionMapper {
    /**
     * Classe permettant de transformer une exception JIRA dans une exception fonctionnelle. 
     * @author AdoNetwork 
     */

     public static JiraBootException transform (JiraMessageException jiraException ) {
        JiraBootException myException = new JiraBootException();

        if (jiraException != null) {
            myException.setName(jiraException.getErrorName());

            String messages = null;
            if (jiraException.getErrorMessages().size() !=0 ) {
                for (JiraErrorMessage msg : jiraException.getErrorMessages()) {
                    messages += msg.getMessage() + "\n";
                } 
                myException.setMessages(messages);
            }
        }

        return myException;
     }
}
