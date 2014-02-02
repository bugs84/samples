package samples

groovy.grape.Grape.grab([group:'org.apache.ivy', module:'ivy', version:'2.0.0-beta1', conf:['default', 'optional']],
     [group:'org.apache.ant', module:'ant', version:'1.7.0'])


//Guava Import
@Grab(group = 'com.google.guava', module = 'guava', version = 'r05')
import com.google.common.collect.Lists

List<String> employeeList = Lists.newArrayList("a", "b", "c");
System.out.println("Guava downloaded from maven repo :) : " + employeeList);

