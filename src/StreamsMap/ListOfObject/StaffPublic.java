/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsMap.ListOfObject;

/**
 *
 * @author ibnahmad
 */
public class StaffPublic {
    
    private String name;
    private int age;
    private String extra;

    public StaffPublic() {
    }
    
    

    public StaffPublic(String name, int age, String extra) {
        this.name = name;
        this.age = age;
        this.extra = extra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getExtra() {
        return extra;
    }

    @Override
    public String toString() {
        return "StaffPublic{" + "name=" + name + ", age=" + age + ", extra=" + extra + '}';
    }
    
    
    
}
