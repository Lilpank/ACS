<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8"/>
<<<<<<< HEAD
                <title>Students</title>
            </head>
            <body>
                <a href="/xsl/room">Show rooms</a>
            </body>
            <body>
                <a href="/xsl/dorm">Show dormitories</a>
=======
                <title>Orders</title>
            </head>
            <body>
                <a href="/xsl/orders">Show orders</a>
>>>>>>> 0acf1ed31b62ebe8e967442038f3c29222b46b25
            </body>
        </html>
        <table border="1" style="margin-top: 5px">
            <tr bgcolor="#CCCCCC">
<<<<<<< HEAD

=======
>>>>>>> 0acf1ed31b62ebe8e967442038f3c29222b46b25
                <td>
                    <strong>id_dorm</strong>
                </td>
                <td>
                    <strong>id_card</strong>
                </td>
                <td>
                    <strong>id_room</strong>
                </td>
                <td>
                    <strong>full_name</strong>
                </td>
                <td>
                    <strong>sex</strong>
                </td>
                <td>
                    <strong>avg_score</strong>
                </td>
                <td>
                    <strong>year_education</strong>
                </td>
            </tr>
<<<<<<< HEAD
            <xsl:for-each select="ArrayList/item">
=======
            <xsl:for-each select="List/item">
>>>>>>> 0acf1ed31b62ebe8e967442038f3c29222b46b25
                <tr>
                    <td>
                        <xsl:value-of select="id_dorm"/>
                    </td>
                    <td>
                        <xsl:value-of select="id_card"/>
                    </td>
                    <td>
                        <xsl:value-of select="id_room"/>
                    </td>
                    <td>
                        <xsl:value-of select="full_name"/>
                    </td>
                    <td>
                        <xsl:value-of select="sex"/>
                    </td>
                    <td>
                        <xsl:value-of select="avg_score"/>
                    </td>
                    <td>
<<<<<<< HEAD
                        <xsl:value-of select="yearEducation"/>
=======
                        <xsl:value-of select="year_education"/>
>>>>>>> 0acf1ed31b62ebe8e967442038f3c29222b46b25
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>