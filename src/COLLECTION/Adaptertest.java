package COLLECTION;

interface TargetInterface {
    void targetMethod();
}

// 已有的类
class ExistingClass {
    public void existingMethod() {
        System.out.println("Existing method implementation");
    }
}

// 适配器类
class Adapter implements TargetInterface {
    private ExistingClass existingClass;

    public Adapter(ExistingClass existingClass) {
        this.existingClass = existingClass;
    }

    @Override
    public void targetMethod() {
        // 使用已有类的方法来实现目标接口的方法
        existingClass.existingMethod();
    }
}

public class Adaptertest {
    public static void main(String[] args) {
        ExistingClass existingClass = new ExistingClass();
        TargetInterface adapter = new Adapter(existingClass);

        // 使用目标接口的方法
        adapter.targetMethod();  // 输出: Existing method implementation
    }
}