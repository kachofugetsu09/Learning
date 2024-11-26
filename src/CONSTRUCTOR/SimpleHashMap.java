package CONSTRUCTOR;


// SimpleHashMap类，泛型K表示键的类型，V表示值的类型
public class SimpleHashMap<K, V> {
    // 初始容量，哈希表的默认大小
    private static final int INITIAL_CAPACITY = 16;
    // 负载因子，用于确定何时扩容
    private static final float LOAD_FACTOR = 0.75f;

    // 存储哈希表的数组
    private Entry<K, V>[] table;
    // 当前哈希表中的键值对数量
    private int size;

    // 构造方法，初始化哈希表
    public SimpleHashMap() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    // Entry类，表示哈希表中的一个键值对
    static class Entry<K, V> {
        final K key;  // 键
        V value;      // 值
        Entry<K, V> next;  // 指向下一个Entry的引用，用于处理冲突

        // 构造方法，初始化键值对
        Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    // put方法，向哈希表中添加键值对
    public void put(K key, V value) {
        int hash = hash(key);  // 计算键的哈希值
        int index = indexFor(hash, table.length);  // 计算哈希值对应的数组索引

        // 遍历链表，检查是否存在相同的键
        for (Entry<K, V> e = table[index]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                e.value = value;  // 如果键已存在，更新其值
                return;
            }
        }
        // 如果键不存在，添加新的键值对
        addEntry(hash, key, value, index);
    }

    // get方法，根据键获取值
    public V get(K key) {
        int hash = hash(key);  // 计算键的哈希值
        int index = indexFor(hash, table.length);  // 计算哈希值对应的数组索引

        // 遍历链表，查找对应的键
        for (Entry<K, V> e = table[index]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                return e.value;  // 找到键，返回对应的值
            }
        }

        // 如果键不存在，返回null
        return null;
    }

    // hash方法，计算键的哈希值
    private int hash(Object key) {
        return (key == null) ? 0 : Math.abs(key.hashCode());
    }

    // size方法，返回哈希表中的键值对数量
    private int size() {
        return size;
    }

    // indexFor方法，根据哈希值和数组长度计算索引
    //哈希表通过哈希函数将键映射到一个数组的索引位置。
    // 哈希函数的目的是将键的值转换为一个数组的索引位置，
    // 从而使得键值对能够被快速存储和查找。
    private int indexFor(int hash, int length) {
        return hash % length;
    }

    // resize方法，扩容哈希表
    private void resize(int newCapacity) {
        Entry<K, V>[] newTable = new Entry[newCapacity];  // 创建新表
        for (Entry<K, V> e : table) {  // 遍历旧表
            while (e != null) {
                Entry<K, V> next = e.next;  // 保存下一个节点
                int index = indexFor(hash(e.key), newCapacity);  // 计算新索引
                e.next = newTable[index];  // 插入到新表中
                newTable[index] = e;
                e = next;  // 继续处理下一个节点
            }
        }
        table = newTable;  // 更新表引用
    }

    // addEntry方法，添加新的键值对
    private void addEntry(int hash, K key, V value, int index) {
        Entry<K, V> newEntry = new Entry<>(key, value, table[index]);  // 创建新节点
        table[index] = newEntry;  // 插入到链表头部
        size++;  // 增加键值对数量

        // 检查是否需要扩容
        if (size >= table.length * LOAD_FACTOR) {
            resize(2 * table.length);  // 扩容为原来的两倍
        }
    }
}
