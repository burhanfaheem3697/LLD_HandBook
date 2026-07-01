# 20_PROJECT_PORTFOLIO

Every major project uses this portfolio standard.

## Required Repository Structure

```text
project-name/
  README.md
  docs/
    architecture.md
    adr/
    diagrams/
    api.md
    testing.md
  src/main/java/
  src/test/java/
  build.gradle or pom.xml
  .github/workflows/ci.yml
```

## README Template

- Problem statement
- Core use cases
- Architecture overview
- How to run
- How to test
- Key design decisions
- Known limitations
- Future improvements

## Project Ladder

| Stage | Projects |
|---|---|
| Foundations | CLI Task Tracker, Parking Lot |
| OOAD | Chess, ATM, Splitwise |
| Design maturity | BookMyShow, Food Delivery, Ride Sharing |
| Framework basics | Logging Framework, Configuration Framework, Plugin Framework |
| Systems | Scheduler, Mini Tomcat, Mini Netty |
| Persistence | Connection Pool, ORM, Mini Hibernate |
| Distributed/evented | Mini Redis, Mini Kafka |
| Production/platform | Feature Flag System, API Gateway |
| Framework engineering | Mini Spring, REST Framework, Workflow Engine, Rule Engine |
| Final | Integrated Engineering Ecosystem |

## Code Review Checklist

- Are responsibilities explicit and cohesive?
- Are invariants enforced at the right boundary?
- Are abstractions justified by real variation?
- Is failure behavior defined?
- Are tests meaningful and maintainable?
- Are diagrams consistent with code?
- Are extension points documented?
- Can a new engineer understand the system from the README and docs?

## Common Discussion Points

The projects are not designed as interview drills, but they naturally prepare the learner to discuss design. For each project, be ready to explain requirements, constraints, object model, architecture, trade-offs, testing, operational concerns, and future evolution.

