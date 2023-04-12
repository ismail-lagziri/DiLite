package PresSpringXML;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "beans")
public class Beans {
    private List<Bean> beans = new ArrayList<>();

    public List<Bean> getBeans() {
        return beans;
    }

    @XmlElement(name = "bean")
    public void setBeans(List<Bean> beans) {
        this.beans = beans;
    }
}
