package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {

    private Boolean answer = false;

    public Response(Boolean answer) {
        super();
        this.answer = answer;
    }

    public Response() {
        super();
        // TODO Auto-generated constructor stub
    }

    @XmlElement(name = "answer", defaultValue = "false")
    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((answer == null) ? 0 : answer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Response other = (Response) obj;
        if (answer == null) {
            return other.answer == null;
        } else return answer.equals(other.answer);
    }
}
