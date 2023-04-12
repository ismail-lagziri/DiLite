package PresSpringXML;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bean")
public class Bean {
    private String id;
    private String className;

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    @XmlAttribute(name = "class")
    public void setClassName(String className) {
        this.className = className;
    }
}