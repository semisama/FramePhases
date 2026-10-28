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
- core ui module is created and added the theme and the book card composable to it , then added the dependency to the app module and used the book card in the main activity.