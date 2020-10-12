### **Intallation**

Download the .jar file from releases.

Add the .jar file to you library`s.

````manifest
Maven repo Coming soon.

Note:  JDA ist required.
````

**Have Fun**



### **Usage**
1.Create a JDABuilder.
```java
JDA builder = new JDABuilder(AccountType.BOT);
builder.setToken("you token");
```

2.Create a new CommandHandler instance.
```java
public static CommandHandler handler;
```

3.Give the CommandHandler instance a value.
```java
handler = new CommandHandler("you prefix");
```

4.Register the CommandHandler to JDA.
```java
builder.setEventManager(new AnnotatedEventManager());
builder.addEventListeners(handler);
```

5.Create a Command
```java
class TestCommand implements ICommand 
{
    @Override
    @RegisterCommand(aliases = "test")
    public void onCommand(Message message) {
        MessageChannel channel = msg.getChannel();
        channel.send("Test").queue();
    }
}
```

6.Register a Command.
```java
handler.registerCommand(new TestCommand());
```