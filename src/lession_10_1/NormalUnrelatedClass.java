package lession_10_1;

import lession_10.ParentClass;

public class NormalUnrelatedClass {
    public void doSth() {
        ParentClass childClass = new ChildClass();
        childClass.fromParent();
    }
}
