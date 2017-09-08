package com.mic.app.model;

import javax.persistence.*;

@Entity
@Table(name = "IP_GROUP")
public class IPGroup {

    @Id
    @Column(name="GROUP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String groupId;

    @Column(name="NAME")
    private String name;

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public IPGroup() {
    }

}
