#通过schema引入自定义注解处理器
## 通过schema将自定义注解引入出现错误
02-Jun-2017 08:15:18.210 SEVERE [RMI TCP Connection(3)-127.0.0.1] org.springframework.web.context.ContextLoader.initWebApplicationContext Context initialization failed
 org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException: Line 11 in XML document from ServletContext resource [/WEB-INF/applicationContext.xml] is invalid; nested exception is org.xml.sax.SAXParseException; lineNumber: 11; columnNumber: 37; cvc-complex-type.2.4.c: 通配符的匹配很全面, 但无法找到元素 'valueSetter:annotation-driven' 的声明。
 * 添加location配置：
 xsi:schemaLocation="http://localhost/schema/valueSetter         http://localhost/schema/valueSetter.xsd ">