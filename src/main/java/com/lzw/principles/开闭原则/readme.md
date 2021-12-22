开闭原则：**对扩展开放，对修改关闭**。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果

使用搜狗输入法中不同皮肤的实现作为案例

所有的皮肤都有一个共同的规范，定义出一个皮肤抽象类AbstractSkin

有多种皮肤的实现，分别为默认皮肤 DefaultDkin，其他皮肤 OrderSkin，继承 AbstractSkin抽象类

使用搜狗输入法时会时会用到不同的皮肤， SogouInput类中调用皮肤显示方法

Client类使用搜狗输入法时，如果要选择不同的皮肤，传AbstractSkin不同的实现类到SogouInput中即可，而不需要修改SogouInput类中的具体实现

