package com;

import java.util.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Request {
    private List<Client> listOfClients = new ArrayList<>();

    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Request(List<Client> listOfClients) {
        super();
        this.listOfClients = listOfClients;
    }

    @XmlElementWrapper
    @XmlElement(name = "Client")
    public List<Client> getListOfClients() {
        return listOfClients;
    }

    public void setListOfClients(List<Client> listOfClients) {
        this.listOfClients = listOfClients;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listOfClients == null) ? 0 : listOfClients.hashCode());
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
        Request other = (Request) obj;
        if (listOfClients == null) {
            return other.listOfClients == null;
        } else return listOfClients.equals(other.listOfClients);
    }
}
