package pers.panqt.design.patterns._07Decorator;

/**  @author panqt 2019/03/25 16:22
 *   
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
