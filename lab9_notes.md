first task is done  , after clean build  is ; Reusing configuration cache.
> Task :app:clean

BUILD SUCCESSFUL in 242ms
1 actionable task: 1 executed
Configuration cache entry reused.
and after rebuilding the project is ; BUILD SUCCESSFUL in 2s
36 actionable tasks: 36 executed
Configuration cache entry reused.
for incrimental after I did a small change in the code and rebuild the project is ; BUILD SUCCESSFUL in 912ms
36 actionable tasks: 5 executed, 31 up-to-date
answer to q one ; Which module should know the least about the others, and which the most?
the book class should know the least about the others,it depends on nothing and the app should know the most about the others.wires everything together. 
for task 2 I ve added versions on version catalog ; 
- Added versions: navigationCompose, coroutines
- Added libraries: lifecycle-viewmodel-compose, lifecycle-viewmodel-savedstate,
  lifecycle-runtime-compose, navigation-compose, kotlinx-coroutines-core,
  kotlinx-coroutines-test
- Reflection: two different versions of the same lib → Gradle forces one (usually highest),
  risking NoSuchMethodError / untested behavior. Catalog keeps only one version for all. 
- followed the instructions for task 3 and moved the book.kts to inside of the module then  checked the dependencies synced it and then run the app again it took 14 s to compile.
- for task 4 followed the instructions again and saw that if an information is private to the module we cannot acces it from the app , it wont bring the import action . 
- task 5  , created a kotlin library  , depends ony to the core model , added the price fomatter , added the test cases  (4) , tests are running on jvm to get the faster feed back.
- core ui module is created and added the theme and the book card composable to it , then added the dependency to the app module and used the book card in the main activity.also ı ıactually commented out some lines from the core uis gradle but it still did not brake the app or caused any errors so ım moving on. 
- about task 7 with api , core model leaked onto apps compile classpath, theorugh core util. so implementation is like capsuling the core model module from the app module.
- task 8,
  Calculating task graph as no cached configuration is available for tasks: projects

> Task :projects

Projects:

------------------------------------------------------------
Root project 'FramePhases'
------------------------------------------------------------

Location: C:\Users\semra\AndroidStudioProjects\FramePhases

Project hierarchy:

Root project 'FramePhases'
+--- Project ':app'
\--- Project ':core'
+--- Project ':core:model'
+--- Project ':core:ui'
\--- Project ':core:util'

Project locations:

project ':app' - \app
project ':core' - \core
project ':core:model' - \core\model
project ':core:ui' - \core\ui
project ':core:util' - \core\util

To see a list of the tasks of a project, run gradlew <project-path>:tasks
For example, try running gradlew :app:tasks
  here is the hierarchy of the project and the location of each module..
task9 corestrings
- Created a 1-file Kotlin module (3 string constants) just to measure its cost.
- Removed it afterward (Remove Module + delete folder + remove include() and dependency line).
- Conclusion: no real reason (different owner/release cadence/reuse) justified a separate
  module for 3 constants -> this is the "too fine" granularity pitfall from Lecture 6.
  In a real app, UI strings belong in Android string resources (res/values/strings.xml),
  not a dedicated Gradle module.
- part B :partb task 10 created a new module called books-api, added the BookRepository interface to it, and added the dependency to the core util module. Then I changed the dependency of the core util module to use the books-api module instead of the core model module. Finally, I updated the core util module to use the BookRepository interface instead of the Book class directly.
- task11 ; encapsulation , using internal prevents the details from leaking the out world , it only tells what it does. dependcy inversion ; inmemeory book repository depends on the interface not the implementation.
- api vs impl ; api is the interface and impl is the implementation of the interface. api is used by the core util module and impl is used by the app module. api is used to decouple the core util module from the app module.