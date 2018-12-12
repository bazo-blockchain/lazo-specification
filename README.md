Lazo: Language Specification
============================

[![Build Status](https://travis-ci.org/bazo-blockchain/lazo-specification.svg?branch=master)](https://travis-ci.org/bazo-blockchain/lazo-specification)

Lazo is a  statically typed, imperative and non-turing complete programming language.

Background
----------

The Bazo Blockchain is a research blockchain to test different mechanisms and algorithms. In the current version, a Proof-of-Stake consensus algorithm and mechanisms to run the blockchain on mobile devices are integrated. Furthermore, there is also a virtual machine available to interpret and execute IL codes on the Bazo Blockchain. The goal of this study work is to specify a smart contract language for the Bazo Blochchain.

Result
-------

* [Language specification](https://github.com/bazo-blockchain/lazo-specification/releases/download/v1.0/Language.Specification-v1.pdf)
* Lazo grammar
  * [AntLR](syntax-antlr/src/main/antlr/Lazo.g4)
  * [EBNF (generated)](syntax-ebnf/lazo.ebnf)
* [Contract examples](examples/)
* [Presentation](https://docs.google.com/presentation/d/1NFIAtIN9LL2fssvS7Yw1wGSYKf3AX5rshSoDYe4OwTo/edit?usp=sharing)

Example
-------

A "Simple Contract" program written in Lazo.

```csharp
version 1.0

contract SimpleContract{
    Map<address, int> payments
    
    [Payable]
    [Pre: msg.coins > 0]
    function void pay() {
        payments[msg.sender] += msg.coins
    }
}
```

Run Tests
---------
In order to run tests, execute the following command:

```bash
// Change directory
cd syntax-antlr

// Run tests
./gradlew test
```

Or use an IDE such as IntelliJ with the Gradle plugin (config parameter: test).
