package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Faq extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq_xml);


        textView = findViewById(R.id.text);

        String para = "What is the justification of GST?\n" +
                "\n" +
                "The introduction of GST at the Central level will not only include comprehensively more indirect\n" +
                "Central taxes and integrate goods and service taxes for the purpose of set-off relief, but may\n" +
                "also lead to revenue gain for the Centre through widening of the dealer base by capturing value\n" +
                "addition in the distributive trade and increased compliance. In the GST, both the cascading\n" +
                "effects of CENVAT and service tax are removed with set-off, and a constant chain of set-off from the original producer’s point and service provider’s point up to the retailer’s level is\n" +
                "established which reduces the burden of all cascading effects. This is the real meaning of GST,GST provide comprehensive and wider coverage of input credit setoff, you can use\n" +
                "service tax credit for the payment of tax on sale of goods etc.CST will be removed and need not pay. At present there is no input tax credit available for\n" +
                "CST.Many indirect taxes in state and central level included by GST, You need to pay a single GST\n" +
                "instead of all.By reducing the tax burden the competitiveness of Indian products in international market is expected to increase and there by development of the nation.\n" +
                "\n" +
                "What is GST?how does it work?\n" +
                "\n" +
                "Only a registered person can charge and collect GST on the taxable supplies of goods and services made by him. GST is charged on the value or selling price of the products. The amount of GST incurred on input (input tax) can be deducted from the amount of GST charged (output tax) by the registered personThe Goods and Services Tax (GST) is a value-added tax levied on most goods and services sold for domestic consumption. The GST is paid by consumers, but it is remitted to the government by the businesses selling the goods and services. ... Also referred to as Value-Added Tax (VAT) in some countries.GST is a consumption based tax levied on sale, manufacture and consumption on goods  services at a national level. ... State GST (SGST) Which will be levied by State. Integrated GST (IGST) – which will be levied by Central Government on inter-State supply of goods and services.\n" +
                "\n" +
                "How can the burden of tax,in general,fall under GST?\n" +
                "\n" +
                "In a majority of supplies of goods, the tax incidence approved by the GST Council is much lower than the present combined indirect tax rates levied on account of central excise duty rates/ embedded central excise duty rates/ service tax post-clearance embedding, VAT rates or weighted average VAT rates, cascading of VAT over excise duty and tax incidence on account of central sales tax, octroi, entry tax levied by the Centre\n" +
                "\n" +
                "How will GST benefit industry,trade and agriculture?\n" +
                "\n" +
                "mentioned in Answer to Question 3, the GST will give more relief to industry, trade and agriculture through a more comprehensive and wider coverage of input tax set-off and service tax set-off, subsuming of several Central and State taxes in the GST and phasing out of CST.\n" +
                "\n" +
                "The transparent and complete chain of set-offs which will result in widening of tax base and better tax compliance may also lead to lowering of tax burden on an average dealer in industry, trade and agriculture.\n" +
                "\n" +
                "How will GST benefit the exporters?\n" +
                "\n" +
                "The subsuming of major Central and State taxes in GST, complete and comprehensive set-off of input goods and services and phasing  out of Central Sales Tax (CST) would reduce the cost of locally manufactured goods and services. This will increase the competitiveness of Indian goods and services in the international market and give boost to Indian exports. The uniformity in tax rates and procedures across the country will also go a long way in reducing the compliance cost.\n" +
                "\n" +
                "How will GST benefit the small entrepreneurs and small treaders?\n" +
                "\n" +
                "  The present threshold prescribed in different State VAT Acts below which VAT is not applicable varies from State to State. The existing threshold of goods under State VAT is Rs. 5 lakhs for a majority of bigger States and a lower threshold for North Eastern States and Special Category States. A uniform State GST threshold across States is desirable and, therefore, the Empowered Committee has recommended that a threshold of gross annual turnover of Rs. 10 lakh both for goods and services for all the States and Union Territories may be adopted with adequate compensation for the States (particularly, the States in North-Eastern Region and Special Category States) where lower threshold had prevailed in the VAT regime. Keeping in view the interest of small traders and small scale industries and to avoid dual control, the States considered that the threshold for Central GST for goods may be kept at Rs.1.5 crore and the threshold for services should also be appropriately high\n" +
                "\n" +
                "How will GST benefit the common consumers?\n" +
                "\n" +
                "As already mentioned in Answer to Question 3, with the introduction of GST, all the cascading effects of CENVAT and service tax will be more comprehensively removed with a continuous chain of set-off from the producer’s point to the retailer’s point than what was possible under the prevailing CENVAT and VAT regime. Certain major Central and State taxes will also be subsumed in GST and CST will be phased out. Other things remaining the same, the burden of tax on goods would, in general, fall under GST and  that would benefit the consumers.\n" +
                "\n" +
                "What are the salient features of the proposed GST model?\n" +
                "\n" +
                "Consistent with the federal structure of the country, the GST will have two components: one levied by the Centre (hereinafter referred to as Central GST), and the other levied by the States (hereinafter referred to as State GST). This dual GST model would be implemented through multiple statutes (one for CGST and SGST statute for every State). However, the basic features of law such as chargeability, definition of taxable event and taxable person, measure of levy including valuation provisions, basis of classification etc. would be uniform across these statutes as far as practicable.The Central GST and the State GST would\n" +
                "be applicable to all transactions of goods and services except the exempted goods and services, goods which are outside the purview of GST and the transactions which are below the prescribed threshold limits.Since the Central GST and State GST are to be treated separately, in general, taxes paid against the Central GST shall be allowed to be taken as input tax credit (ITC) for the Central GST and could be utilized only against the payment of Central GST.  The same principle will be applicable for the State GST.\n" +
                "\n" +
                "Why is Dual GST required?\n" +
                "\n" +
                "     India is a federal country where both the Center and the States have been assigned the powers to levy and collect taxes through appropriate legislation. Both the levels of Government have distinct responsibilities to perform according to the division of powers prescribed in the Constitution for which they need to raise resources.\n" +
                "\n" +
                "A dual GST will, therefore, be in keeping with the Constitutional requirement of fiscal federalism.\n" +
                "\n" +
                "What is the rate structure proposed under GST?\n" +
                "\n" +
                "The Empowered Committee has decided to adopt a two-rate structure –a lower rate for necessary items and items of basic importance and a standard rate for goods in general. There will also be a special rate for precious metals and a list of exempted items. For upholding of special needs of each State as well as a balanced approach to federal flexibility, it is being discussed whether the exempted list under VAT regime including Goods of Local Importance may be retained in the exempted list under State GST in the initial years. It is also being discussed whether the Government of India may adopt, to begin with, a similar approach towards exempted list under the CGST.\n" +
                "\n" +
                "For CGST relating to goods, the  States considered that the Government of India might also have a two-rate structure, with conformity in the levels of rate with the SGST. For taxation of services, there may be a single rate for both CGST and SGST.\n" +
                "\n" +
                "What is the concept of providing threshold exemption for GST?\n" +
                "\n" +
                "The present thresholds prescribed in different State VAT Acts below which VAT is not applicable varies from State to State.  A uniform State GST threshold across States is desirable and, therefore, as already mentioned in Answer to Question 6, it has been considered that a threshold of gross annual turnover of Rs. 10 lakh both for goods and services for all the States and Union Territories might be adopted with adequate compensation for the States (particularly, the States in North-Eastern Region and Special Category States) where lower threshold had prevailed in the VAT regime. Keeping in view the interest of small traders and small scale industries and to avoid dual control, the States also considered that the threshold for Central GST for goods may be kept Rs.1.5 Crore and the threshold for services should also be appropriately high.\n" +
                "\n" +
                "What is the scope of composition and compounding scheme under GST?\n" +
                "\n" +
                "As already mentioned in Answer to Question 6, a Composition/Compounding Scheme will be an important feature of GST to protect the interests of small traders and small scale industries. The Composition/Compounding scheme for the purpose of GST should have an upper ceiling on gross annual turnover and a floor tax rate with respect to gross annual turnover. In particular there will be a compounding cut-off at Rs. 50 lakhs of the gross annual turnover and the floor rate of 0.5% across the States. The scheme would allow option for GST registration for dealers with turnover below the compounding cut-off.\n" +
                "\n" +
                "How will imports be taxed under GST\n" +
                "\n" +
                "With Constitutional Amendments, both CGST and SGST will be levied on import of goods and services into the country. The incidence of tax will follow the destination principle and the tax revenue in case of SGST will accrue to the State where the imported goods and services are consumed. Full and complete set-off will be available on the GST paid on import on goods and services.";
        textView.setText(para);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}

