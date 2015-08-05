package samples.swingbuilder

import groovy.swing.SwingBuilder
import net.miginfocom.swing.MigLayout

import javax.swing.*


def products = ["product 1", "product 2"]
def builds = ["build 11", "build 12", "latest"]
JComboBox productCombo
JComboBox versionCombo
def sb = new SwingBuilder()
def dialog = sb.dialog(modal: true, title: "TADAAA") {
    registerBeanFactory('migLayout', MigLayout)
    frame(id: 'eventScrollPanel', pack: true, show: true, defaultCloseOperation: JFrame.EXIT_ON_CLOSE) {
        migLayout(layoutConstraints: "fill,debug", columnConstraints: "", rowConstraints: "")

        label(text: "test", constraints: "width 500px!, hmin 140")
        productCombo = comboBox(items: products, constraints: "", actionPerformed: {
            println "Action performed ${productCombo.selectedItem}"
            versionCombo.removeAllItems()
            builds.each {
                versionCombo.addItem(it)
            }
            versionCombo.addItem(UUID.randomUUID().toString())
        })
        versionCombo = comboBox(items: builds, constraints: "")
        label("AAA")
        widget(new JLabel("My custom component"), constraints: "w 200px")
    }
}



