package org.techtown.ideup;

public class post {
    String subject, content;

    public post(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public String getcontent() {
        return content;
    }

    public void setcontent(String content) {
        this.content = content;
    }
}
