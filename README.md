# Overview

https://github.com/larchanjo/poc-pitest

## Testing Pitest

We have configured the plugin to run the goal `mutationCoverage` after the maven `test` phase, 
so run commando below: 

`mvn clean test`

After running the command all the results of `pitest` are found in `pit-reports` and it is possible to 
see the coverage and the mutating testing, as a result, the block of code:

```
if (product.getValue() <= 0) {
  System.out.println("[ERROR] Value must no be zero or negative");
  throw new IllegalArgumentException("Value must no be zero or negative");
}
```

Was not covered and the test `testCreate` passed when the `pitest` removed it!

**WE HAVE A BUG** and mutating test discovered it in the unit testing moment!