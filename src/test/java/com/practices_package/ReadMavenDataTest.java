package com.practices_package;

import org.testng.annotations.Test;

/* to read data from maven file insatll the below dependency
 * <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>

the below source and target version of maven apache need to be copy paste before or after the <dependencies> tag but in the project only
    <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
*/
public class ReadMavenDataTest {

		@Test
		public void readMavenDataTest() {
			System.out.println("---MAven Script--");
		}
}
