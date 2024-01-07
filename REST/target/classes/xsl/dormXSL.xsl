<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8"/>
                <title>Dormitories</title>
            </head>
            <body>
                <a href="/xsl/orders">Show dormitories</a>
            </body>
        </html>
        <table border="1" style="margin-top: 5px">
            <tr bgcolor="#CCCCCC">
                <td>
                    <strong>university</strong>
                </td>
                <td>
                    <strong>id_dorm</strong>
                </td>
            </tr>
            <xsl:for-each select="List/item">
                <tr>
                    <td>
                        <xsl:value-of select="university"/>
                    </td>
                    <td>
                        <xsl:value-of select="id_dorm"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>