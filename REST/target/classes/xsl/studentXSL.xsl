<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8"/>
                <title>Students</title>
            </head>
            <body>
                <a href="/xsl/student">Show students</a>
            </body>
        </html>
        <table border="1" style="margin-top: 5px">
            <tr bgcolor="#CCCCCC">
                <td>
                    <strong>Id</strong>
                </td>
                <td>
                    <strong>id_room</strong>
                </td>
            </tr>
            <xsl:for-each select=".">
                <tr>
                    <td>
                        <xsl:value-of select="id_room"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>