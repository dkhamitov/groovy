package org.codehaus.groovy.ast.stmt

import groovy.transform.CompileStatic
import org.codehaus.groovy.control.SourceUnit
import org.junit.Test

@CompileStatic
class AssertStatementTest {
    @Test
    void test() {
//        def src = 'assert 1 == 2'
//        def src = 'assert 1 = 2'
        /*
        def src = '''
            assert a = 42
            println('a = ' + a)

            if (b = -42) {
                println('b = ' + b)
            }

            if (c = 0) {
                println('c = ' + c)
            }
        '''
        */
        def src = 'assert 1 == 2'
        def srcUnit = SourceUnit.create('dummy', src)
        parse(srcUnit)
        def ast = srcUnit.getAST()

        println(ast)
    }

    static void parse(SourceUnit src) {
        src.parse()
        src.completePhase()
        src.nextPhase()
        src.convert()
    }
}