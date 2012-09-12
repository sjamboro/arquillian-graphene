package org.jboss.arquillian.graphene.enricher;

import static org.junit.Assert.assertEquals;

import org.jboss.arquillian.graphene.enricher.page.TestPage;
import org.jboss.arquillian.graphene.enricher.page.TestPage2;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestInitializingPageObjects1 extends MoreSpecificAbstractTest<TestPage, TestPage2> {

    private final String EXPECTED_NESTED_ELEMENT_TEXT = "Some Value";

    @Test
    public void testPageObjectWithGenericTypeIsInitialized1() {
        loadPage();
        assertEquals("The page object was not set correctly!", pageWithGenericType.getAbstractPageFragment()
            .invokeMethodOnElementRefByXpath(), EXPECTED_NESTED_ELEMENT_TEXT);
    }

    @Test
    public void testPageObjectWithGenericTypeIsInitialized2() {
        loadPage();
        assertEquals("The page object was not set correctly!", anotherPageWithGenericType.getAbstractPageFragment()
            .invokeMethodOnElementRefByXpath(), EXPECTED_NESTED_ELEMENT_TEXT);
    }
}
