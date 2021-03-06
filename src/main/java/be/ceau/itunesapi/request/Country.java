/*
	Copyright 2021 Marceau Dewilde <m@ceau.be>
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
		https://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.itunesapi.request;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/**
 * <p>
 * Enumeration of possible countries that have searchable stores.
 * </p>
 * <p>
 * iTunes default is US.
 * </p>
 */
public enum Country {

	AFGHANISTAN("AF"),
	ALAND_ISLANDS("AX"),
	ALBANIA("AL"),
	ALGERIA("DZ"),
	AMERICAN_SAMOA("AS"),
	ANDORRA("AD"),
	ANGOLA("AO"),
	ANGUILLA("AI"),
	ANTARCTICA("AQ"),
	ANTIGUA_AND_BARBUDA("AG"),
	ARGENTINA("AR"),
	ARMENIA("AM"),
	ARUBA("AW"),
	AUSTRALIA("AU"),
	AUSTRIA("AT"),
	AZERBAIJAN("AZ"),
	BAHAMAS("BS"),
	BAHRAIN("BH"),
	BANGLADESH("BD"),
	BARBADOS("BB"),
	BELARUS("BY"),
	BELGIUM("BE"),
	BELIZE("BZ"),
	BENIN("BJ"),
	BERMUDA("BM"),
	BHUTAN("BT"),
	BOLIVIA("BO"),
	BONAIRE("BQ"),
	BOSNIA_AND_HERZEGOVINA("BA"),
	BOTSWANA("BW"),
	BOUVET_ISLAND("BV"),
	BRAZIL("BR"),
	BRITISH_INDIAN_OCEAN_TERRITORY("IO"),
	BRITISH_VIRGIN_ISLANDS("VG"),
	BRUNEI_DARUSSALAM("BN"),
	BULGARIA("BG"),
	BURKINA_FASO("BF"),
	BURUNDI("BI"),
	CABO_VERDE("CV"),
	CAMBODIA("KH"),
	CAMEROON("CM"),
	CANADA("CA"),
	CAYMAN_ISLANDS("KY"),
	CENTRAL_AFRICAN_REPUBLIC("CF"),
	CHAD("TD"),
	CHILE("CL"),
	CHINA("CN"),
	CHRISTMAS_ISLAND("CX"),
	COCOS_ISLANDS("CC"),
	COLOMBIA("CO"),
	COMOROS("KM"),
	CONGO("CG"),
	CONGO_DEMOCRATIC_REPUBLIC_OF("CD"),
	COOK_ISLANDS("CK"),
	COSTA_RICA("CR"),
	COTE_D_IVOIRE("CI"),
	CROATIA("HR"),
	CUBA("CU"),
	CURACAO("CW"),
	CYPRUS("CY"),
	CZECHIA("CZ"),
	DENMARK("DK"),
	DJIBOUTI("DJ"),
	DOMINICA("DM"),
	DOMINICAN_REPUBLIC("DO"),
	ECUADOR("EC"),
	EGYPT("EG"),
	EL_SALVADOR("SV"),
	EQUATORIAL_GUINEA("GQ"),
	ERITREA("ER"),
	ESTONIA("EE"),
	ETHIOPIA("ET"),
	FALKLAND_ISLANDS("FK"),
	FAROE_ISLANDS("FO"),
	FIJI("FJ"),
	FINLAND("FI"),
	FRANCE("FR"),
	FRENCH_GUIANA("GF"),
	FRENCH_POLYNESIA("PF"),
	FRENCH_SOUTHERN_TERRITORIES("TF"),
	GABON("GA"),
	GAMBIA("GM"),
	GEORGIA("GE"),
	GERMANY("DE"),
	GHANA("GH"),
	GIBRALTAR("GI"),
	GREECE("GR"),
	GREENLAND("GL"),
	GRENADA("GD"),
	GUADELOUPE("GP"),
	GUAM("GU"),
	GUATEMALA("GT"),
	GUERNSEY("GG"),
	GUINEA("GN"),
	GUINEA_BISSAU("GW"),
	GUYANA("GY"),
	HAITI("HT"),
	HEARD_ISLAND_AND_MCDONALD_ISLANDS("HM"),
	HONDURAS("HN"),
	HONG_KONG("HK"),
	HUNGARY("HU"),
	ICELAND("IS"),
	INDIA("IN"),
	INDONESIA("ID"),
	IRAN("IR"),
	IRAQ("IQ"),
	IRELAND("IE"),
	ISLE_OF_MAN("IM"),
	ISRAEL("IL"),
	ITALY("IT"),
	JAMAICA("JM"),
	JAPAN("JP"),
	JERSEY("JE"),
	JORDAN("JO"),
	KAZAKHSTAN("KZ"),
	KENYA("KE"),
	KIRIBATI("KI"),
	KUWAIT("KW"),
	KYRGYZSTAN("KG"),
	LAOS("LA"),
	LATVIA("LV"),
	LEBANON("LB"),
	LESOTHO("LS"),
	LIBERIA("LR"),
	LIBYA("LY"),
	LIECHTENSTEIN("LI"),
	LITHUANIA("LT"),
	LUXEMBOURG("LU"),
	MACAO("MO"),
	MACEDONIA("MK"),
	MADAGASCAR("MG"),
	MALAWI("MW"),
	MALAYSIA("MY"),
	MALDIVES("MV"),
	MALI("ML"),
	MALTA("MT"),
	MARSHALL_ISLANDS("MH"),
	MARTINIQUE("MQ"),
	MAURITANIA("MR"),
	MAURITIUS("MU"),
	MAYOTTE("YT"),
	MEXICO("MX"),
	MICRONESIA("FM"),
	MOLDOVA("MD"),
	MONACO("MC"),
	MONGOLIA("MN"),
	MONTENEGRO("ME"),
	MONTSERRAT("MS"),
	MOROCCO("MA"),
	MOZAMBIQUE("MZ"),
	MYANMAR("MM"),
	NAMIBIA("NA"),
	NAURU("NR"),
	NEPAL("NP"),
	NETHERLANDS("NL"),
	NEW_CALEDONIA("NC"),
	NEW_ZEALAND("NZ"),
	NICARAGUA("NI"),
	NIGER("NE"),
	NIGERIA("NG"),
	NIUE("NU"),
	NORFOLK_ISLAND("NF"),
	NORTH_KOREA("KP"),
	NORTHERN_MARIANA_ISLANDS("MP"),
	NORWAY("NO"),
	OMAN("OM"),
	PAKISTAN("PK"),
	PALAU("PW"),
	PALESTINE("PS"),
	PANAMA("PA"),
	PAPUA_NEW_GUINEA("PG"),
	PARAGUAY("PY"),
	PERU("PE"),
	PHILIPPINES("PH"),
	PITCAIRN("PN"),
	POLAND("PL"),
	PORTUGAL("PT"),
	PUERTO_RICO("PR"),
	QATAR("QA"),
	REUNION("RE"),
	ROMANIA("RO"),
	RUSSIAN_FEDERATION("RU"),
	RWANDA("RW"),
	SAINT_BARTHELEMY("BL"),
	SAINT_HELENA("SH"),
	SAINT_KITTS_AND_NEVIS("KN"),
	SAINT_LUCIA("LC"),
	SAINT_MARTIN("MF"),
	SAINT_PIERRE_AND_MIQUELON("PM"),
	SAINT_VINCENT_AND_THE_GRENADINES("VC"),
	SAMOA("WS"),
	SAN_MARINO("SM"),
	SAO_TOME_AND_PRINCIPE("ST"),
	SAUDI_ARABIA("SA"),
	SENEGAL("SN"),
	SERBIA("RS"),
	SEYCHELLES("SC"),
	SIERRA_LEONE("SL"),
	SINGAPORE("SG"),
	SINT_MAARTEN("SX"),
	SLOVAKIA("SK"),
	SLOVENIA("SI"),
	SOLOMON_ISLANDS("SB"),
	SOMALIA("SO"),
	SOUTH_AFRICA("ZA"),
	SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("GS"),
	SOUTH_KOREA("KR"),
	SOUTH_SUDAN("SS"),
	SPAIN("ES"),
	SRI_LANKA("LK"),
	SUDAN("SD"),
	SURINAME("SR"),
	SVALBARD_AND_JAN_MAYEN("SJ"),
	SWAZILAND("SZ"),
	SWEDEN("SE"),
	SWITZERLAND("CH"),
	SYRIAN_ARAB_REPUBLIC("SY"),
	TAIWAN("TW"),
	TAJIKISTAN("TJ"),
	TANZANIA("TZ"),
	THAILAND("TH"),
	TIMOR_LESTE("TL"),
	TOGO("TG"),
	TOKELAU("TK"),
	TONGA("TO"),
	TRINIDAD_AND_TOBAGO("TT"),
	TUNISIA("TN"),
	TURKEY("TR"),
	TURKMENISTAN("TM"),
	TURKS_AND_CAICOS_ISLANDS("TC"),
	TUVALU("TV"),
	UGANDA("UG"),
	UKRAINE("UA"),
	UNITED_ARAB_EMIRATES("AE"),
	UNITED_KINGDOM("GB"),
	UNITED_STATES("US"),
	UNITED_STATES_MINOR_OUTLYING_ISLANDS("UM"),
	URUGUAY("UY"),
	US_VIRGIN_ISLANDS("VI"),
	UZBEKISTAN("UZ"),
	VANUATU("VU"),
	VATICAN_CITY("VA"),
	VENEZUELA("VE"),
	VIET_NAM("VN"),
	WALLIS_AND_FUTUNA("WF"),
	WESTERN_SAHARA("EH"),
	YEMEN("YE"),
	ZAMBIA("ZM"),
	ZIMBABWE("ZW");
	
	private final String iso;
	private Country(String iso) {
		this.iso = iso;
	}
	
	public static final Set<Country> ALL = Collections.unmodifiableSet(EnumSet.allOf(Country.class));
	
	public String getIso() {
		return this.iso;
	}

}
