**Problem**: "I have knowledge, logic and functions scattered all over the world... How do I bring them together?"

**Solution**: "Use a common notation to represent knowledge and logic. Use this notation to implement and link functions"

Without digressing much on ontologies, we may start with a basic analysis of common code with the question:

> Who does what, to what?

```
Parent {
    //Add constructor, funciton if you like
    new Man().run()
    new Car().start()
}
```
Here we have a Man, running and a Car, starting. 
- Man can decide to run. 
- A car is started by someone else.
- Both these were called within some parent class/location.

This notation is thus flawed, as it isn't representing a clear picture of what is going on.

```
    controller {
        victim.action()
    }
```

> Promoting the 'dot'

Here we promote the dot popularly placed between the victim and the action, to the controller.

```
    controller {
        change {
            victim.initalState()
            victim.finalState()
        }
    }
```

Thus, here we have the well-known state machine. controller is changing states. Let's call the controller, `domain` from now on.


> We say,

`Within a domain, states change from one (inputs) to another (output)`

Interestingly, this is like a typical function, which accepts input and produces outputs.

> We may say,

`domain(input) -> output`

And we may call this whole representation a `dot`.

So far, this may be considered nothing novel, but as usual, the details are what is important. We will dweleve into it shortly.


### Some things we will be discussing soon

- A true abstraction is something you can forget about
- Anything (dimension) is defined by the input and output states, thus becoming its' identity
- The more specific you get, the most abstract it becomes
- The ability to repeat is true abstraction.
- It is easier to repeat something specific than that which is abstract.
- Data/Cells (Values) become Columns (Dimensions) as they exhibit input and output transforms. Thus anything is a dimension (Column). This challenges a relational representation of information.
