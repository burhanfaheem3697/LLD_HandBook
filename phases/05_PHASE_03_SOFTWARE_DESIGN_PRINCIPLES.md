# Phase 3: Software Design Principles

Hours: 110  
Project: Splitwise Core Model

## Lesson Dependency Graph

| Lesson | Focus | Depends On | Unlocks | Future Applications |
|---|---|---|---|---|
| P03.M01.L01 | SRP and OCP | OOAD | refactorable modules | plugin architecture |
| P03.M01.L02 | LSP and ISP | P03.M01.L01 | substitutable APIs | framework compatibility |
| P03.M01.L03 | DIP and stable abstractions | P03.M01.L02 | DI | Spring |
| P03.M02.L01 | DRY | P03.M01.L03 | knowledge ownership | shared libraries |
| P03.M02.L02 | KISS and YAGNI | P03.M02.L01 | design restraint | architecture trade-offs |
| P03.M02.L03 | Tell Don't Ask and Law of Demeter | P03.M02.L02 | behavioral objects | aggregate design |
| P03.M03.L01 | Preconditions, postconditions, invariants | P03.M02.L03 | contracts | API validation |
| P03.M03.L02 | Nullability and validation | P03.M03.L01 | failure design | REST errors |
| P03.M03.L03 | Compatibility and versioning | P03.M03.L02 | public API evolution | libraries/frameworks |
| P03.M04.L01 | Coupling/cohesion metrics | P03.M03.L03 | design diagnosis | architecture fitness |
| P03.M04.L02 | Intentional violations | P03.M04.L01 | judgment | production design review |
| P03.M04.L03 | Splitwise model | P03.M04.L02 | applied principles | DDD and transactions |

## Required Resources

- Books: `Agile Software Development, Principles, Patterns, and Practices`; `Effective Java`; `A Philosophy of Software Design`.
- Labs: refactor procedural expense settlement into objects; enforce invariants; design interfaces for settlement strategies.
- Diagrams: dependency direction diagrams, package diagrams, sequence diagrams for expense split.
- Mini project: Splitwise core with users, groups, expenses, split strategies, balances, and settlement suggestions.

## Assessment

Review Splitwise for SOLID, GRASP, DRY, KISS, YAGNI, Law of Demeter, contracts, and API compatibility.


## Guided Self-Study Program

This section upgrades the phase from syllabus to workbook. It does not change phase order, module order, lesson order, project order, dependencies, outcomes, or philosophy. It expands each existing lesson into a concrete self-study plan.

### Phase Study Rhythm

- Study one lesson at a time.
- Do not begin the next lesson until the checklist for the current lesson is complete.
- Keep one Git repository for the phase and one folder per lesson.
- Commit after each day with a message that names the lesson ID.
- Maintain a learning-journal.md with definitions, mistakes, diagrams, and senior-engineering observations.

### P03.M01.L01 Guided Study: Single Responsibility and Open/Closed

#### Lesson Overview

- Learning objectives: explain Single Responsibility and Open/Closed precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: all prior phases and the phase prerequisites listed above.
- Knowledge dependency graph: $(@{Id=P03.M01.L01; Title=Single Responsibility and Open/Closed}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Single Responsibility and Open/Closed".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Single Responsibility and Open/Closed".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m01l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Single Responsibility and Open/Closed".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M01.L01; Title=Single Responsibility and Open/Closed}.Id):

- Input: a tiny but realistic scenario involving "Single Responsibility and Open/Closed".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Single Responsibility and Open/Closed" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m01l01/
src/test/java/handbook/phase03/p03m01l01/
docs/P03.M01.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M01.L02 Guided Study: Liskov and Interface Segregation

#### Lesson Overview

- Learning objectives: explain Liskov and Interface Segregation precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M01.L02; Title=Liskov and Interface Segregation}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Liskov and Interface Segregation".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Liskov and Interface Segregation".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m01l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Liskov and Interface Segregation".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M01.L02; Title=Liskov and Interface Segregation}.Id):

- Input: a tiny but realistic scenario involving "Liskov and Interface Segregation".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Liskov and Interface Segregation" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m01l02/
src/test/java/handbook/phase03/p03m01l02/
docs/P03.M01.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M01.L03 Guided Study: Dependency Inversion and stable abstractions

#### Lesson Overview

- Learning objectives: explain Dependency Inversion and stable abstractions precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M01.L03; Title=Dependency Inversion and stable abstractions}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Dependency Inversion and stable abstractions".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Dependency Inversion and stable abstractions".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m01l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Dependency Inversion and stable abstractions".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M01.L03; Title=Dependency Inversion and stable abstractions}.Id):

- Input: a tiny but realistic scenario involving "Dependency Inversion and stable abstractions".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Dependency Inversion and stable abstractions" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m01l03/
src/test/java/handbook/phase03/p03m01l03/
docs/P03.M01.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 03.01 Project

- Scope: integrate the module lessons: Single Responsibility and Open/Closed; Liskov and Interface Segregation; Dependency Inversion and stable abstractions.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses software design principles and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P03.M02.L01 Guided Study: DRY and knowledge duplication

#### Lesson Overview

- Learning objectives: explain DRY and knowledge duplication precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M02.L01; Title=DRY and knowledge duplication}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "DRY and knowledge duplication".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "DRY and knowledge duplication".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m02l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "DRY and knowledge duplication".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M02.L01; Title=DRY and knowledge duplication}.Id):

- Input: a tiny but realistic scenario involving "DRY and knowledge duplication".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "DRY and knowledge duplication" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m02l01/
src/test/java/handbook/phase03/p03m02l01/
docs/P03.M02.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M02.L02 Guided Study: KISS, YAGNI, and speculative generality

#### Lesson Overview

- Learning objectives: explain KISS, YAGNI, and speculative generality precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M02.L02; Title=KISS, YAGNI, and speculative generality}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "KISS, YAGNI, and speculative generality".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "KISS, YAGNI, and speculative generality".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m02l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "KISS, YAGNI, and speculative generality".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M02.L02; Title=KISS, YAGNI, and speculative generality}.Id):

- Input: a tiny but realistic scenario involving "KISS, YAGNI, and speculative generality".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "KISS, YAGNI, and speculative generality" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m02l02/
src/test/java/handbook/phase03/p03m02l02/
docs/P03.M02.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M02.L03 Guided Study: Tell Don't Ask and Law of Demeter

#### Lesson Overview

- Learning objectives: explain Tell Don't Ask and Law of Demeter precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M02.L03; Title=Tell Don't Ask and Law of Demeter}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Tell Don't Ask and Law of Demeter".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Tell Don't Ask and Law of Demeter".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m02l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Tell Don't Ask and Law of Demeter".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M02.L03; Title=Tell Don't Ask and Law of Demeter}.Id):

- Input: a tiny but realistic scenario involving "Tell Don't Ask and Law of Demeter".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Tell Don't Ask and Law of Demeter" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m02l03/
src/test/java/handbook/phase03/p03m02l03/
docs/P03.M02.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 03.02 Project

- Scope: integrate the module lessons: DRY and knowledge duplication; KISS, YAGNI, and speculative generality; Tell Don't Ask and Law of Demeter.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses software design principles and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P03.M03.L01 Guided Study: Preconditions, postconditions, and invariants

#### Lesson Overview

- Learning objectives: explain Preconditions, postconditions, and invariants precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M03.L01; Title=Preconditions, postconditions, and invariants}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Preconditions, postconditions, and invariants".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Preconditions, postconditions, and invariants".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m03l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Preconditions, postconditions, and invariants".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M03.L01; Title=Preconditions, postconditions, and invariants}.Id):

- Input: a tiny but realistic scenario involving "Preconditions, postconditions, and invariants".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Preconditions, postconditions, and invariants" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m03l01/
src/test/java/handbook/phase03/p03m03l01/
docs/P03.M03.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M03.L02 Guided Study: Nullability, validation, and failure contracts

#### Lesson Overview

- Learning objectives: explain Nullability, validation, and failure contracts precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M03.L02; Title=Nullability, validation, and failure contracts}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Nullability, validation, and failure contracts".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Nullability, validation, and failure contracts".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m03l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Nullability, validation, and failure contracts".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M03.L02; Title=Nullability, validation, and failure contracts}.Id):

- Input: a tiny but realistic scenario involving "Nullability, validation, and failure contracts".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Nullability, validation, and failure contracts" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m03l02/
src/test/java/handbook/phase03/p03m03l02/
docs/P03.M03.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M03.L03 Guided Study: API compatibility and semantic versioning

#### Lesson Overview

- Learning objectives: explain API compatibility and semantic versioning precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M03.L03; Title=API compatibility and semantic versioning}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "API compatibility and semantic versioning".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "API compatibility and semantic versioning".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m03l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "API compatibility and semantic versioning".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M03.L03; Title=API compatibility and semantic versioning}.Id):

- Input: a tiny but realistic scenario involving "API compatibility and semantic versioning".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "API compatibility and semantic versioning" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m03l03/
src/test/java/handbook/phase03/p03m03l03/
docs/P03.M03.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 03.03 Project

- Scope: integrate the module lessons: Preconditions, postconditions, and invariants; Nullability, validation, and failure contracts; API compatibility and semantic versioning.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses software design principles and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P03.M04.L01 Guided Study: Coupling and cohesion metrics

#### Lesson Overview

- Learning objectives: explain Coupling and cohesion metrics precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M04.L01; Title=Coupling and cohesion metrics}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Coupling and cohesion metrics".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Coupling and cohesion metrics".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m04l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Coupling and cohesion metrics".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M04.L01; Title=Coupling and cohesion metrics}.Id):

- Input: a tiny but realistic scenario involving "Coupling and cohesion metrics".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Coupling and cohesion metrics" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m04l01/
src/test/java/handbook/phase03/p03m04l01/
docs/P03.M04.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M04.L02 Guided Study: Intentional rule violations

#### Lesson Overview

- Learning objectives: explain Intentional rule violations precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M04.L02; Title=Intentional rule violations}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Intentional rule violations".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Intentional rule violations".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m04l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Intentional rule violations".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M04.L02; Title=Intentional rule violations}.Id):

- Input: a tiny but realistic scenario involving "Intentional rule violations".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Intentional rule violations" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m04l02/
src/test/java/handbook/phase03/p03m04l02/
docs/P03.M04.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P03.M04.L03 Guided Study: Project: Splitwise core model

#### Lesson Overview

- Learning objectives: explain Project: Splitwise core model precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to software design principles.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P03.M04.L03; Title=Project: Splitwise core model}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 3 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P03, selecting the lecture whose topic is closest to "Project: Splitwise core model".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Agile Software Development, PPP, Robert C. Martin; A Philosophy of Software Design, John Ousterhout.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 3; choose the row matching "Project: Splitwise core model".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to software design principles until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase03.lessonp03m04l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Project: Splitwise core model".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P03.M04.L03; Title=Project: Splitwise core model}.Id):

- Input: a tiny but realistic scenario involving "Project: Splitwise core model".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Project: Splitwise core model" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase03/p03m04l03/
src/test/java/handbook/phase03/p03m04l03/
docs/P03.M04.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in software design principles where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring Framework, Guava, and OkHttp. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 03.04 Project

- Scope: integrate the module lessons: Coupling and cohesion metrics; Intentional rule violations; Project: Splitwise core model.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses software design principles and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

