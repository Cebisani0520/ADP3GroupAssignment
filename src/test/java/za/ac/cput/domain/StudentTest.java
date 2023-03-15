/** StudentTest.java
 * This program runs test that explains object equality, object identity, disabling tests, failing test and timeouts.
 * Andrea Jacobs 218024266
 * 15 March 2023 */

package za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
class StudentTest {
    public void testEquality() {
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Student s = new Student("Andrea", "Jacobs");
            list.add(s);
        }
        assertEquals(10, list.size());
    }

    @Test
    public void testIdentity() {
        Student student = new Student();
        Student student1 = student;
        Student student2 = new Student();

        assertSame(student, student1);
        assertNotSame(student, student2);
    }

    @Test
    @Timeout(2)
    public void testTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }
  
}