# scip-json - print SCIP files as JSON

## Installation:

- Download the binary from [releases page](https://github.com/keynmol/scip-json/releases/latest)
- Build it yourself:
  - Install [Scala CLI](https://scala-cli.virtuslab.org/install)
  - Build the binary:
    ```
    scala-cli package --native generated test.scala -f -o scip-json-cli
    ```

## Usage

```
> scip-json-cli index.scip | jq | head
{
  "documents": [
    {
      "occurrences": [
        {
          "range": [
            2,
            17,
            27
          ],
```

