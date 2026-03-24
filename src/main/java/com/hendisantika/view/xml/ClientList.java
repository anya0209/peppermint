package com.hendisantika.view.xml;

import com.hendisantika.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Project : spring-boot-invoice-app-system
 */
@XmlRootElement(name = "clients")
public class ClientList {

    @XmlElement(name = "client")
    public List<Client> clients;

    public ClientList() {}

    public ClientList(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }
}
