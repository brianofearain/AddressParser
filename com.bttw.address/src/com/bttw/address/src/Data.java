package com.bttw.address.src;

import java.util.HashMap;
import java.util.Map;

class Data
{
  private static final Map<String, String> NUMBER_MAP = new HashMap();
  private static final Map<String, String> DIRECTIONAL_MAP = new HashMap();
  private static final Map<String, String> STREET_TYPE_MAP = new HashMap();
  private static final Map<String, String> COUNTIES_MAP = new HashMap();
  private static final Map<String, String> UNIT_MAP = new HashMap();
  private static final Map<String, String> SAINT_NAME_MAP = new HashMap();
  private static final Map<String, String> ORDINAL_MAP = new HashMap();

  static {
    ORDINAL_MAP.put("ZEROTH", "0TH");
    ORDINAL_MAP.put("FIRST", "1ST");
    ORDINAL_MAP.put("SECOND", "2ND");
    ORDINAL_MAP.put("THIRD", "3RD");
    ORDINAL_MAP.put("FORTH", "4TH");
    ORDINAL_MAP.put("FOURTH", "4TH");
    ORDINAL_MAP.put("FIFTH", "5TH");
    ORDINAL_MAP.put("SIXTH", "6TH");
    ORDINAL_MAP.put("SEVENTH", "7TH");
    ORDINAL_MAP.put("EIGHTH", "8TH");
    ORDINAL_MAP.put("NINTH", "9TH");
    ORDINAL_MAP.put("NINETH", "9TH");
    ORDINAL_MAP.put("TENTH", "10TH");
    ORDINAL_MAP.put("ELEVENTH", "11TH");
    ORDINAL_MAP.put("TWELFTH", "12TH");
    ORDINAL_MAP.put("TWELVETH", "12TH");
    ORDINAL_MAP.put("THIRTEENTH", "13TH");
    ORDINAL_MAP.put("FOURTEENTH", "14TH");
    ORDINAL_MAP.put("FIFTEENTH", "15TH");
    ORDINAL_MAP.put("SIXTEENTH", "16TH");
    ORDINAL_MAP.put("SEVENTEENTH", "17TH");
    ORDINAL_MAP.put("EIGHTEENTH", "18TH");
    ORDINAL_MAP.put("NINETEENTH", "19TH");
    ORDINAL_MAP.put("NINTEENTH", "19TH");

    NUMBER_MAP.put("ZERO", "0");
    NUMBER_MAP.put("ONE", "1");
    NUMBER_MAP.put("TWO", "2");
    NUMBER_MAP.put("THREE", "3");
    NUMBER_MAP.put("FOUR", "4");
    NUMBER_MAP.put("FIVE", "5");
    NUMBER_MAP.put("SIX", "6");
    NUMBER_MAP.put("SEVEN", "7");
    NUMBER_MAP.put("EIGHT", "8");
    NUMBER_MAP.put("NINE", "9");
    NUMBER_MAP.put("TEN", "0");
    NUMBER_MAP.put("ELEVEN", "11");
    NUMBER_MAP.put("TWELVE", "12");
    NUMBER_MAP.put("THIRTEEN", "13");
    NUMBER_MAP.put("FOURTEEN", "14");
    NUMBER_MAP.put("FIFTEEN", "15");
    NUMBER_MAP.put("SIXTEEN", "16");
    NUMBER_MAP.put("SEVENTEEN", "17");
    NUMBER_MAP.put("EIGHTTEEN", "18");
    NUMBER_MAP.put("NINETEEN", "19");
    NUMBER_MAP.put("TWENTY", "20");
    NUMBER_MAP.put("THIRTY", "30");
    NUMBER_MAP.put("FOURTY", "40");
    NUMBER_MAP.put("FORTY", "40");
    NUMBER_MAP.put("FIFTY", "50");
    NUMBER_MAP.put("SIXTY", "60");
    NUMBER_MAP.put("SEVENTY", "70");
    NUMBER_MAP.put("EIGHTY", "80");
    NUMBER_MAP.put("NINETY", "90");
    NUMBER_MAP.put("NINTY", "90");

    UNIT_MAP.put("APARTMENT", "APT");
    UNIT_MAP.put("APMT", "APT");
    UNIT_MAP.put("BASEMENT", "BSMT");
    UNIT_MAP.put("BUILDING", "BLDG");
    UNIT_MAP.put("DEPARTMENT", "DEPT");
    UNIT_MAP.put("FLOOR", "FL");
    UNIT_MAP.put("F", "FL");
    UNIT_MAP.put("FRONG", "FRNT");
    UNIT_MAP.put("HANGAR", "HNGR");
    UNIT_MAP.put("LOBBY", "LBBY");
    UNIT_MAP.put("LBY", "LBBY");
    UNIT_MAP.put("LOT", "LOT");
    UNIT_MAP.put("LT", "LOT");
    UNIT_MAP.put("LOWER", "LOWR");
    UNIT_MAP.put("NUMBER", "#");
    UNIT_MAP.put("#", "#");
    UNIT_MAP.put("NO", "#");
    UNIT_MAP.put("OFFICE", "OFC");
    UNIT_MAP.put("OFIC", "OFC");
    UNIT_MAP.put("OFFC", "OFC");
    UNIT_MAP.put("PIER", "PIER");
    UNIT_MAP.put("PENTHOUSE", "PH");
    UNIT_MAP.put("PBOX", "PO BOX");
    UNIT_MAP.put("PB", "PO BOX");
    UNIT_MAP.put("PBX", "PO BOX");
    UNIT_MAP.put("P O BOX", "PO BOX");
    UNIT_MAP.put("POBX", "PO BOX");
    UNIT_MAP.put("POBOX", "PO BOX");
    UNIT_MAP.put("BOX", "BX");
    UNIT_MAP.put("REAR", "REAR");
    UNIT_MAP.put("ROOM", "RM");
    UNIT_MAP.put("SIDE", "SIDE");
    UNIT_MAP.put("SLIP", "SLIP");
    UNIT_MAP.put("SPACE", "SPC");
    UNIT_MAP.put("STOP", "STOP");
    UNIT_MAP.put("SUITE", "STE");
    UNIT_MAP.put("SUIT", "STE");
    UNIT_MAP.put("TRAILER", "TRLR");
    UNIT_MAP.put("UNIT", "UNT");
    UNIT_MAP.put("UPPER", "UPPR");

    DIRECTIONAL_MAP.put("NORTH", "N");
    DIRECTIONAL_MAP.put("NORTHEAST", "NE");
    DIRECTIONAL_MAP.put("EAST", "E");
    DIRECTIONAL_MAP.put("SOUTHEAST", "SE");
    DIRECTIONAL_MAP.put("SOUTH", "S");
    DIRECTIONAL_MAP.put("SOUTHWEST", "SW");
    DIRECTIONAL_MAP.put("WEST", "W");
    DIRECTIONAL_MAP.put("NORTHWEST", "NW");

    STREET_TYPE_MAP.put("PKWAY", "PKY");
    STREET_TYPE_MAP.put("PKWYS", "PKY");
    STREET_TYPE_MAP.put("PKWY", "PKY");

    STREET_TYPE_MAP.put("ROW", "ROW");
    STREET_TYPE_MAP.put("RAMP", "RAMP");
    STREET_TYPE_MAP.put("RUN", "RUN");
    STREET_TYPE_MAP.put("RUE", "RUE");
    STREET_TYPE_MAP.put("MALL", "MAL");
    STREET_TYPE_MAP.put("MART", "MART");
    STREET_TYPE_MAP.put("PASS", "PASS");
    STREET_TYPE_MAP.put("WALKWAY", "WKWY");

    STREET_TYPE_MAP.put("GRD", "GRD");
    STREET_TYPE_MAP.put("THWY", "THWY");
    STREET_TYPE_MAP.put("UNP", "UNP");

    STREET_TYPE_MAP.put("ALLEE", "ALY");
    STREET_TYPE_MAP.put("ALLEY", "ALY");
    STREET_TYPE_MAP.put("ALLY", "ALY");
    STREET_TYPE_MAP.put("ANEX", "ANX");
    STREET_TYPE_MAP.put("ANNEX", "ANX");
    STREET_TYPE_MAP.put("ANNX", "ANX");
    STREET_TYPE_MAP.put("ARCADE", "ARC");
    STREET_TYPE_MAP.put("AV", "AVE");
    STREET_TYPE_MAP.put("AVEN", "AVE");
    STREET_TYPE_MAP.put("AVENU", "AVE");
    STREET_TYPE_MAP.put("AVENUE", "AVE");
    STREET_TYPE_MAP.put("AVN", "AVE");
    STREET_TYPE_MAP.put("AVNUE", "AVE");
    STREET_TYPE_MAP.put("BAYOO", "BYU");
    STREET_TYPE_MAP.put("BAYOU", "BYU");
    STREET_TYPE_MAP.put("BEACH", "BCH");
    STREET_TYPE_MAP.put("BEND", "BND");
    STREET_TYPE_MAP.put("BLUF", "BLF");
    STREET_TYPE_MAP.put("BLUFF", "BLF");
    STREET_TYPE_MAP.put("BLUFFS", "BLFS");
    STREET_TYPE_MAP.put("BOT", "BTM");
    STREET_TYPE_MAP.put("BOTTM", "BTM");
    STREET_TYPE_MAP.put("BOTTOM", "BTM");
    STREET_TYPE_MAP.put("BOUL", "BLVD");
    STREET_TYPE_MAP.put("BOULEVARD", "BLVD");
    STREET_TYPE_MAP.put("BOULV", "BLVD");
    STREET_TYPE_MAP.put("BRANCH", "BR");
    STREET_TYPE_MAP.put("BRDGE", "BRG");
    STREET_TYPE_MAP.put("BRIDGE", "BRG");
    STREET_TYPE_MAP.put("BRNCH", "BR");
    STREET_TYPE_MAP.put("BROOK", "BRK");
    STREET_TYPE_MAP.put("BROOKS", "BRKS");
    STREET_TYPE_MAP.put("BURG", "BG");
    STREET_TYPE_MAP.put("BURGS", "BGS");
    STREET_TYPE_MAP.put("BYPA", "BYP");
    STREET_TYPE_MAP.put("BYPAS", "BYP");
    STREET_TYPE_MAP.put("BYPASS", "BYP");
    STREET_TYPE_MAP.put("BYPS", "BYP");
    STREET_TYPE_MAP.put("CAMP", "CP");
    STREET_TYPE_MAP.put("CANYN", "CYN");
    STREET_TYPE_MAP.put("CANYON", "CYN");
    STREET_TYPE_MAP.put("CAPE", "CPE");
    STREET_TYPE_MAP.put("CAUSEWAY", "CSWY");
    STREET_TYPE_MAP.put("CAUSWAY", "CSWY");
    STREET_TYPE_MAP.put("CEN", "CTR");
    STREET_TYPE_MAP.put("CENT", "CTR");
    STREET_TYPE_MAP.put("CENTER", "CTR");
    STREET_TYPE_MAP.put("CENTERS", "CTRS");
    STREET_TYPE_MAP.put("CENTR", "CTR");
    STREET_TYPE_MAP.put("CENTRE", "CTR");
    STREET_TYPE_MAP.put("CIRC", "CIR");
    STREET_TYPE_MAP.put("CIRCL", "CIR");
    STREET_TYPE_MAP.put("CIRCLE", "CIR");
    STREET_TYPE_MAP.put("CIRCLES", "CIRS");
    STREET_TYPE_MAP.put("CK", "CRK");
    STREET_TYPE_MAP.put("CLIFF", "CLF");
    STREET_TYPE_MAP.put("CLIFFS", "CLFS");
    STREET_TYPE_MAP.put("CLUB", "CLB");
    STREET_TYPE_MAP.put("CMP", "CP");
    STREET_TYPE_MAP.put("CNTER", "CTR");
    STREET_TYPE_MAP.put("CNTR", "CTR");
    STREET_TYPE_MAP.put("CNYN", "CYN");
    STREET_TYPE_MAP.put("COMMON", "CMN");
    STREET_TYPE_MAP.put("CORNER", "COR");
    STREET_TYPE_MAP.put("CORNERS", "CORS");
    STREET_TYPE_MAP.put("COURSE", "CRSE");
    STREET_TYPE_MAP.put("COURT", "CT");
    STREET_TYPE_MAP.put("COURTS", "CTS");
    STREET_TYPE_MAP.put("COVE", "CV");
    STREET_TYPE_MAP.put("COVES", "CVS");
    STREET_TYPE_MAP.put("CR", "CRK");
    STREET_TYPE_MAP.put("CRCL", "CIR");
    STREET_TYPE_MAP.put("CRCLE", "CIR");
    STREET_TYPE_MAP.put("CRECENT", "CRES");
    STREET_TYPE_MAP.put("CREEK", "CRK");
    STREET_TYPE_MAP.put("CRESCENT", "CRES");
    STREET_TYPE_MAP.put("CRESENT", "CRES");
    STREET_TYPE_MAP.put("CREST", "CRST");
    STREET_TYPE_MAP.put("CROSSING", "XING");
    STREET_TYPE_MAP.put("CROSSROAD", "XRD");
    STREET_TYPE_MAP.put("CRSCNT", "CRES");
    STREET_TYPE_MAP.put("CRSENT", "CRES");
    STREET_TYPE_MAP.put("CRSNT", "CRES");
    STREET_TYPE_MAP.put("CRSSING", "XING");
    STREET_TYPE_MAP.put("CRSSNG", "XING");
    STREET_TYPE_MAP.put("CRT", "CT");
    STREET_TYPE_MAP.put("CURVE", "CURV");
    STREET_TYPE_MAP.put("DALE", "DL");
    STREET_TYPE_MAP.put("DAM", "DM");
    STREET_TYPE_MAP.put("DIV", "DV");
    STREET_TYPE_MAP.put("DIVIDE", "DV");
    STREET_TYPE_MAP.put("DRIV", "DR");
    STREET_TYPE_MAP.put("DRIVE", "DR");
    STREET_TYPE_MAP.put("DRIVES", "DRS");
    STREET_TYPE_MAP.put("DRV", "DR");
    STREET_TYPE_MAP.put("DVD", "DV");
    STREET_TYPE_MAP.put("ESTATE", "EST");
    STREET_TYPE_MAP.put("ESTATES", "ESTS");
    STREET_TYPE_MAP.put("EXP", "EXPY");
    STREET_TYPE_MAP.put("EXPR", "EXPY");
    STREET_TYPE_MAP.put("EXPRESS", "EXPY");
    STREET_TYPE_MAP.put("EXPRESSWAY", "EXPY");
    STREET_TYPE_MAP.put("EXPW", "EXPY");
    STREET_TYPE_MAP.put("EXTENSION", "EXT");
    STREET_TYPE_MAP.put("EXTENSIONS", "EXTS");
    STREET_TYPE_MAP.put("EXTN", "EXT");
    STREET_TYPE_MAP.put("EXTNSN", "EXT");
    STREET_TYPE_MAP.put("FALLS", "FLS");
    STREET_TYPE_MAP.put("FERRY", "FRY");
    STREET_TYPE_MAP.put("FIELD", "FLD");
    STREET_TYPE_MAP.put("FIELDS", "FLDS");
    STREET_TYPE_MAP.put("FLAT", "FLT");
    STREET_TYPE_MAP.put("FLATS", "FLTS");
    STREET_TYPE_MAP.put("FORD", "FRD");
    STREET_TYPE_MAP.put("FORDS", "FRDS");
    STREET_TYPE_MAP.put("FOREST", "FRST");
    STREET_TYPE_MAP.put("FORESTS", "FRST");
    STREET_TYPE_MAP.put("FORG", "FRG");
    STREET_TYPE_MAP.put("FORGE", "FRG");
    STREET_TYPE_MAP.put("FORGES", "FRGS");
    STREET_TYPE_MAP.put("FORK", "FRK");
    STREET_TYPE_MAP.put("FORKS", "FRKS");
    STREET_TYPE_MAP.put("FORT", "FT");
    STREET_TYPE_MAP.put("FREEWAY", "FWY");
    STREET_TYPE_MAP.put("FREEWY", "FWY");
    STREET_TYPE_MAP.put("FRRY", "FRY");
    STREET_TYPE_MAP.put("FRT", "FT");
    STREET_TYPE_MAP.put("FRWAY", "FWY");
    STREET_TYPE_MAP.put("FRWY", "FWY");
    STREET_TYPE_MAP.put("GARDEN", "GDN");
    STREET_TYPE_MAP.put("GARDENS", "GDNS");
    STREET_TYPE_MAP.put("GARDN", "GDN");
    STREET_TYPE_MAP.put("GATEWAY", "GTWY");
    STREET_TYPE_MAP.put("GATEWY", "GTWY");
    STREET_TYPE_MAP.put("GATWAY", "GTWY");
    STREET_TYPE_MAP.put("GLEN", "GLN");
    STREET_TYPE_MAP.put("GLENS", "GLNS");
    STREET_TYPE_MAP.put("GRDEN", "GDN");
    STREET_TYPE_MAP.put("GRDN", "GDN");
    STREET_TYPE_MAP.put("GRDNS", "GDNS");
    STREET_TYPE_MAP.put("GREEN", "GRN");
    STREET_TYPE_MAP.put("GREENS", "GRNS");
    STREET_TYPE_MAP.put("GROV", "GRV");
    STREET_TYPE_MAP.put("GROVE", "GRV");
    STREET_TYPE_MAP.put("GROVES", "GRVS");
    STREET_TYPE_MAP.put("GTWAY", "GTWY");
    STREET_TYPE_MAP.put("HARB", "HBR");
    STREET_TYPE_MAP.put("HARBOR", "HBR");
    STREET_TYPE_MAP.put("HARBORS", "HBRS");
    STREET_TYPE_MAP.put("HARBR", "HBR");
    STREET_TYPE_MAP.put("HAVEN", "HVN");
    STREET_TYPE_MAP.put("HAVN", "HVN");
    STREET_TYPE_MAP.put("HEIGHT", "HTS");
    STREET_TYPE_MAP.put("HEIGHTS", "HTS");
    STREET_TYPE_MAP.put("HGTS", "HTS");
    STREET_TYPE_MAP.put("HIGHWAY", "HWY");
    STREET_TYPE_MAP.put("HIGHWY", "HWY");
    STREET_TYPE_MAP.put("HILL", "HL");
    STREET_TYPE_MAP.put("HILLS", "HLS");
    STREET_TYPE_MAP.put("HIWAY", "HWY");
    STREET_TYPE_MAP.put("HIWY", "HWY");
    STREET_TYPE_MAP.put("HLLW", "HOLW");
    STREET_TYPE_MAP.put("HOLLOW", "HOLW");
    STREET_TYPE_MAP.put("HOLLOWS", "HOLW");
    STREET_TYPE_MAP.put("HOLWS", "HOLW");
    STREET_TYPE_MAP.put("HRBOR", "HBR");
    STREET_TYPE_MAP.put("HT", "HTS");
    STREET_TYPE_MAP.put("HWAY", "HWY");
    STREET_TYPE_MAP.put("INLET", "INLT");
    STREET_TYPE_MAP.put("ISLAND", "IS");
    STREET_TYPE_MAP.put("ISLANDS", "ISS");
    STREET_TYPE_MAP.put("ISLES", "ISLE");
    STREET_TYPE_MAP.put("ISLND", "IS");
    STREET_TYPE_MAP.put("ISLNDS", "ISS");
    STREET_TYPE_MAP.put("JCTION", "JCT");
    STREET_TYPE_MAP.put("JCTN", "JCT");
    STREET_TYPE_MAP.put("JCTNS", "JCTS");
    STREET_TYPE_MAP.put("JUNCTION", "JCT");
    STREET_TYPE_MAP.put("JUNCTIONS", "JCTS");
    STREET_TYPE_MAP.put("JUNCTN", "JCT");
    STREET_TYPE_MAP.put("JUNCTON", "JCT");
    STREET_TYPE_MAP.put("KEY", "KY");
    STREET_TYPE_MAP.put("KEYS", "KYS");
    STREET_TYPE_MAP.put("KNOL", "KNL");
    STREET_TYPE_MAP.put("KNOLL", "KNL");
    STREET_TYPE_MAP.put("KNOLLS", "KNLS");
    STREET_TYPE_MAP.put("LA", "LN");
    STREET_TYPE_MAP.put("LAKE", "LK");
    STREET_TYPE_MAP.put("LAKES", "LKS");
    STREET_TYPE_MAP.put("LANDING", "LNDG");
    STREET_TYPE_MAP.put("LANE", "LN");
    STREET_TYPE_MAP.put("LANES", "LN");
    STREET_TYPE_MAP.put("LDGE", "LDG");
    STREET_TYPE_MAP.put("LIGHT", "LGT");
    STREET_TYPE_MAP.put("LIGHTS", "LGTS");
    STREET_TYPE_MAP.put("LNDNG", "LNDG");
    STREET_TYPE_MAP.put("LOAF", "LF");
    STREET_TYPE_MAP.put("LOCK", "LCK");
    STREET_TYPE_MAP.put("LOCKS", "LCKS");
    STREET_TYPE_MAP.put("LODG", "LDG");
    STREET_TYPE_MAP.put("LODGE", "LDG");
    STREET_TYPE_MAP.put("LOOPS", "LOOP");
    STREET_TYPE_MAP.put("MANOR", "MNR");
    STREET_TYPE_MAP.put("MANORS", "MNRS");
    STREET_TYPE_MAP.put("MEADOW", "MDW");
    STREET_TYPE_MAP.put("MEADOWS", "MDWS");
    STREET_TYPE_MAP.put("MEDOWS", "MDWS");
    STREET_TYPE_MAP.put("MILL", "ML");
    STREET_TYPE_MAP.put("MILLS", "MLS");
    STREET_TYPE_MAP.put("MISSION", "MSN");
    STREET_TYPE_MAP.put("MISSN", "MSN");
    STREET_TYPE_MAP.put("MNT", "MT");
    STREET_TYPE_MAP.put("MNTAIN", "MTN");
    STREET_TYPE_MAP.put("MNTN", "MTN");
    STREET_TYPE_MAP.put("MNTNS", "MTNS");
    STREET_TYPE_MAP.put("MOTORWAY", "MTWY");
    STREET_TYPE_MAP.put("MOUNT", "MT");
    STREET_TYPE_MAP.put("MOUNTAIN", "MTN");
    STREET_TYPE_MAP.put("MOUNTAINS", "MTNS");
    STREET_TYPE_MAP.put("MOUNTIN", "MTN");
    STREET_TYPE_MAP.put("MSSN", "MSN");
    STREET_TYPE_MAP.put("MTIN", "MTN");
    STREET_TYPE_MAP.put("NECK", "NCK");
    STREET_TYPE_MAP.put("ORCHARD", "ORCH");
    STREET_TYPE_MAP.put("ORCHRD", "ORCH");
    STREET_TYPE_MAP.put("OVERPASS", "OPAS");
    STREET_TYPE_MAP.put("OVL", "OVAL");
    STREET_TYPE_MAP.put("PARKS", "PARK");
    STREET_TYPE_MAP.put("PARKWAY", "PKWY");
    STREET_TYPE_MAP.put("PARKWAYS", "PKWY");
    STREET_TYPE_MAP.put("PARKWY", "PKWY");
    STREET_TYPE_MAP.put("PASSAGE", "PSGE");
    STREET_TYPE_MAP.put("PATHS", "PATH");
    STREET_TYPE_MAP.put("PIKES", "PIKE");
    STREET_TYPE_MAP.put("PINE", "PNE");
    STREET_TYPE_MAP.put("PINES", "PNES");
    STREET_TYPE_MAP.put("PK", "PARK");

    STREET_TYPE_MAP.put("PLACE", "PL");
    STREET_TYPE_MAP.put("PLAIN", "PLN");
    STREET_TYPE_MAP.put("PLAINES", "PLNS");
    STREET_TYPE_MAP.put("PLAINS", "PLNS");
    STREET_TYPE_MAP.put("PLAZA", "PLZ");
    STREET_TYPE_MAP.put("PLZA", "PLZ");
    STREET_TYPE_MAP.put("POINT", "PT");
    STREET_TYPE_MAP.put("POINTS", "PTS");
    STREET_TYPE_MAP.put("PORT", "PRT");
    STREET_TYPE_MAP.put("PORTS", "PRTS");
    STREET_TYPE_MAP.put("PRAIRIE", "PR");
    STREET_TYPE_MAP.put("PRARIE", "PR");
    STREET_TYPE_MAP.put("PRK", "PARK");
    STREET_TYPE_MAP.put("PRR", "PR");
    STREET_TYPE_MAP.put("RAD", "RADL");
    STREET_TYPE_MAP.put("RADIAL", "RADL");
    STREET_TYPE_MAP.put("RADIEL", "RADL");
    STREET_TYPE_MAP.put("RANCH", "RNCH");
    STREET_TYPE_MAP.put("RANCHES", "RNCH");
    STREET_TYPE_MAP.put("RAPID", "RPD");
    STREET_TYPE_MAP.put("RAPIDS", "RPDS");
    STREET_TYPE_MAP.put("RDGE", "RDG");
    STREET_TYPE_MAP.put("REST", "RST");
    STREET_TYPE_MAP.put("RIDGE", "RDG");
    STREET_TYPE_MAP.put("RIDGES", "RDGS");
    STREET_TYPE_MAP.put("RIVER", "RIV");
    STREET_TYPE_MAP.put("RIVR", "RIV");
    STREET_TYPE_MAP.put("RNCHS", "RNCH");
    STREET_TYPE_MAP.put("ROAD", "RD");
    STREET_TYPE_MAP.put("ROADS", "RDS");
    STREET_TYPE_MAP.put("ROUTE", "RTE");
    STREET_TYPE_MAP.put("RVR", "RIV");
    STREET_TYPE_MAP.put("SHOAL", "SHL");
    STREET_TYPE_MAP.put("SHOALS", "SHLS");
    STREET_TYPE_MAP.put("SHOAR", "SHR");
    STREET_TYPE_MAP.put("SHOARS", "SHRS");
    STREET_TYPE_MAP.put("SHORE", "SHR");
    STREET_TYPE_MAP.put("SHORES", "SHRS");
    STREET_TYPE_MAP.put("SKYWAY", "SKWY");
    STREET_TYPE_MAP.put("SPNG", "SPG");
    STREET_TYPE_MAP.put("SPNGS", "SPGS");
    STREET_TYPE_MAP.put("SPRING", "SPG");
    STREET_TYPE_MAP.put("SPRINGS", "SPGS");
    STREET_TYPE_MAP.put("SPRNG", "SPG");
    STREET_TYPE_MAP.put("SPRNGS", "SPGS");
    STREET_TYPE_MAP.put("SPURS", "SPUR");
    STREET_TYPE_MAP.put("SQR", "SQ");
    STREET_TYPE_MAP.put("SQRE", "SQ");
    STREET_TYPE_MAP.put("SQRS", "SQS");
    STREET_TYPE_MAP.put("SQU", "SQ");
    STREET_TYPE_MAP.put("SQUARE", "SQ");
    STREET_TYPE_MAP.put("SQUARES", "SQS");
    STREET_TYPE_MAP.put("STATION", "STA");
    STREET_TYPE_MAP.put("STATN", "STA");
    STREET_TYPE_MAP.put("STN", "STA");
    STREET_TYPE_MAP.put("STR", "ST");
    STREET_TYPE_MAP.put("STRAV", "STRA");
    STREET_TYPE_MAP.put("STRAVE", "STRA");
    STREET_TYPE_MAP.put("STRAVEN", "STRA");
    STREET_TYPE_MAP.put("STRAVENUE", "STRA");
    STREET_TYPE_MAP.put("STRAVN", "STRA");
    STREET_TYPE_MAP.put("STREAM", "STRM");
    STREET_TYPE_MAP.put("STREET", "ST");
    STREET_TYPE_MAP.put("STREETS", "STS");
    STREET_TYPE_MAP.put("STREME", "STRM");
    STREET_TYPE_MAP.put("STRT", "ST");
    STREET_TYPE_MAP.put("STRVN", "STRA");
    STREET_TYPE_MAP.put("STRVNUE", "STRA");
    STREET_TYPE_MAP.put("SUMIT", "SMT");
    STREET_TYPE_MAP.put("SUMITT", "SMT");
    STREET_TYPE_MAP.put("SUMMIT", "SMT");
    STREET_TYPE_MAP.put("TERR", "TER");
    STREET_TYPE_MAP.put("TERRACE", "TER");
    STREET_TYPE_MAP.put("THROUGHWAY", "TRWY");
    STREET_TYPE_MAP.put("TPK", "TPKE");
    STREET_TYPE_MAP.put("TR", "TRL");
    STREET_TYPE_MAP.put("TRACE", "TRCE");
    STREET_TYPE_MAP.put("TRACES", "TRCE");
    STREET_TYPE_MAP.put("TRACK", "TRAK");
    STREET_TYPE_MAP.put("TRACKS", "TRAK");
    STREET_TYPE_MAP.put("TRAFFICWAY", "TRFY");
    STREET_TYPE_MAP.put("TRAIL", "TRL");
    STREET_TYPE_MAP.put("TRAILS", "TRL");
    STREET_TYPE_MAP.put("TRK", "TRAK");
    STREET_TYPE_MAP.put("TRKS", "TRAK");
    STREET_TYPE_MAP.put("TRLS", "TRL");
    STREET_TYPE_MAP.put("TRNPK", "TPKE");
    STREET_TYPE_MAP.put("TRPK", "TPKE");
    STREET_TYPE_MAP.put("TUNEL", "TUNL");
    STREET_TYPE_MAP.put("TUNLS", "TUNL");
    STREET_TYPE_MAP.put("TUNNEL", "TUNL");
    STREET_TYPE_MAP.put("TUNNELS", "TUNL");
    STREET_TYPE_MAP.put("TUNNL", "TUNL");
    STREET_TYPE_MAP.put("TURNPIKE", "TPKE");
    STREET_TYPE_MAP.put("TURNPK", "TPKE");
    STREET_TYPE_MAP.put("UNDERPASS", "UPAS");
    STREET_TYPE_MAP.put("UNION", "UN");
    STREET_TYPE_MAP.put("UNIONS", "UNS");
    STREET_TYPE_MAP.put("VALLEY", "VLY");
    STREET_TYPE_MAP.put("VALLEYS", "VLYS");
    STREET_TYPE_MAP.put("VALLY", "VLY");
    STREET_TYPE_MAP.put("VDCT", "VIA");
    STREET_TYPE_MAP.put("VIADCT", "VIA");
    STREET_TYPE_MAP.put("VIADUCT", "VIA");
    STREET_TYPE_MAP.put("VIEW", "VW");
    STREET_TYPE_MAP.put("VIEWS", "VWS");
    STREET_TYPE_MAP.put("VILL", "VLG");
    STREET_TYPE_MAP.put("VILLAG", "VLG");
    STREET_TYPE_MAP.put("VILLAGE", "VLG");
    STREET_TYPE_MAP.put("VILLAGES", "VLGS");
    STREET_TYPE_MAP.put("VILLE", "VL");
    STREET_TYPE_MAP.put("VILLG", "VLG");
    STREET_TYPE_MAP.put("VILLIAGE", "VLG");
    STREET_TYPE_MAP.put("VIST", "VIS");
    STREET_TYPE_MAP.put("VISTA", "VIS");
    STREET_TYPE_MAP.put("VLLY", "VLY");
    STREET_TYPE_MAP.put("VST", "VIS");
    STREET_TYPE_MAP.put("VSTA", "VIS");
    STREET_TYPE_MAP.put("WALKS", "WALK");
    STREET_TYPE_MAP.put("WELL", "WL");
    STREET_TYPE_MAP.put("WELLS", "WLS");
    STREET_TYPE_MAP.put("WY", "WAY");

    COUNTIES_MAP.put("ALABAMA", "AL");
    COUNTIES_MAP.put("ALASKA", "AK");
    COUNTIES_MAP.put("AMERICAN SAMOA", "AS");
    COUNTIES_MAP.put("ARIZONA", "AZ");
    COUNTIES_MAP.put("ARKANSAS", "AR");
    COUNTIES_MAP.put("CALIFORNIA", "CA");
    COUNTIES_MAP.put("COLORADO", "CO");
    COUNTIES_MAP.put("CONNECTICUT", "CT");
    COUNTIES_MAP.put("DELAWARE", "DE");
    COUNTIES_MAP.put("DISTRICT OF COLUMBIA", "DC");
    COUNTIES_MAP.put("FEDERATED STATES OF MICRONESIA", "FM");
    COUNTIES_MAP.put("FLORIDA", "FL");
    COUNTIES_MAP.put("GEORGIA", "GA");
    COUNTIES_MAP.put("GUAM", "GU");
    COUNTIES_MAP.put("HAWAII", "HI");
    COUNTIES_MAP.put("IDAHO", "ID");
    COUNTIES_MAP.put("ILLINOIS", "IL");
    COUNTIES_MAP.put("INDIANA", "IN");
    COUNTIES_MAP.put("IOWA", "IA");
    COUNTIES_MAP.put("KANSAS", "KS");
    COUNTIES_MAP.put("KENTUCKY", "KY");
    COUNTIES_MAP.put("LOUISIANA", "LA");
    COUNTIES_MAP.put("MAINE", "ME");
    COUNTIES_MAP.put("MARSHALL IS", "MH");
    COUNTIES_MAP.put("MARSHALL ISLANDS", "MH");
    COUNTIES_MAP.put("MARYLAND", "MD");
    COUNTIES_MAP.put("MASSACHUSETTS", "MA");
    COUNTIES_MAP.put("MICHIGAN", "MI");
    COUNTIES_MAP.put("MINNESOTA", "MN");
    COUNTIES_MAP.put("MISSISSIPPI", "MS");
    COUNTIES_MAP.put("MISSOURI", "MO");
    COUNTIES_MAP.put("MONTANA", "MT");
    COUNTIES_MAP.put("NEBRASKA", "NE");
    COUNTIES_MAP.put("NEVADA", "NV");
    COUNTIES_MAP.put("NEW HAMPSHIRE", "NH");
    COUNTIES_MAP.put("NEW JERSEY", "NJ");
    COUNTIES_MAP.put("NEW MEXICO", "NM");
    COUNTIES_MAP.put("NEWJERSEY", "NJ");
    COUNTIES_MAP.put("NEWMEXICO", "NM");
    COUNTIES_MAP.put("NEWYORK", "NY");
    COUNTIES_MAP.put("NEW YORK", "NY");
    COUNTIES_MAP.put("N CAROLINA", "NC");
    COUNTIES_MAP.put("N DAKOTA", "ND");
    COUNTIES_MAP.put("NORTHERN MARIANA ISLANDS", "MP");
    COUNTIES_MAP.put("N CAROLINA", "NC");
    COUNTIES_MAP.put("NORTH DAKOTA", "ND");
    COUNTIES_MAP.put("NORTHERN MARIANA ISLANDS", "MP");
    COUNTIES_MAP.put("OHIO", "OH");
    COUNTIES_MAP.put("OKLAHOMA", "OK");
    COUNTIES_MAP.put("OREGON", "OR");
    COUNTIES_MAP.put("PALAU", "PW");
    COUNTIES_MAP.put("Meath", "Meath");
    COUNTIES_MAP.put("PUERTO RICO", "PR");
    COUNTIES_MAP.put("PUERTORICO", "PR");
    COUNTIES_MAP.put("RHODE ISLAND", "RI");
    COUNTIES_MAP.put("SOUTH CAROLINA", "SC");
    COUNTIES_MAP.put("SOUTH DAKOTA", "SD");
    COUNTIES_MAP.put("S CAROLINA", "SC");
    COUNTIES_MAP.put("S DAKOTA", "SD");
    COUNTIES_MAP.put("TENNESSEE", "TN");
    COUNTIES_MAP.put("TEXAS", "TX");
    COUNTIES_MAP.put("UTAH", "UT");
    COUNTIES_MAP.put("VERMONT", "VT");
    COUNTIES_MAP.put("VIRGIN IS", "VI");
    COUNTIES_MAP.put("VIRGIN ISLANDS", "VI");
    COUNTIES_MAP.put("VIRGINIA", "VA");
    COUNTIES_MAP.put("WASHINGTON", "WA");
    COUNTIES_MAP.put("WEST VIRGINIA", "WV");
    COUNTIES_MAP.put("W VIRGINIA", "WV");
    COUNTIES_MAP.put("WISCONSIN", "WI");
    COUNTIES_MAP.put("WYOMING", "WY");

    SAINT_NAME_MAP.put("ST LOUISVILLE", "SAINT LOUISVILLE");
    SAINT_NAME_MAP.put("ST HENRY", "SAINT HENRY");
    SAINT_NAME_MAP.put("ST HEDWIG", "SAINT HEDWIG");
    SAINT_NAME_MAP.put("ST PARIS", "SAINT PARIS");
    SAINT_NAME_MAP.put("ST DAVID", "SAINT DAVID");
    SAINT_NAME_MAP.put("ST BENEDICT", "SAINT BENEDICT");
    SAINT_NAME_MAP.put("ST GEORGE", "SAINT GEORGE");
    SAINT_NAME_MAP.put("ST BENEDICT", "SAINT BENEDICT");
    SAINT_NAME_MAP.put("ST ANSGAR", "SAINT ANSGAR");
    SAINT_NAME_MAP.put("ST GEORGE", "SAINT GEORGE");
    SAINT_NAME_MAP.put("ST THOMAS", "SAINT THOMAS");
    SAINT_NAME_MAP.put("ST JOSEPH", "SAINT JOSEPH");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST PAUL PARK", "SAINT PAUL PARK");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST MICHAEL", "SAINT MICHAEL");
    SAINT_NAME_MAP.put("ST ALBANS", "SAINT ALBANS");
    SAINT_NAME_MAP.put("ST JOHN", "SAINT JOHN");
    SAINT_NAME_MAP.put("ST JAMES", "SAINT JAMES");
    SAINT_NAME_MAP.put("ST JAMES", "SAINT JAMES");
    SAINT_NAME_MAP.put("ST LAWRENCE", "SAINT LAWRENCE");
    SAINT_NAME_MAP.put("ST MATTHEWS", "SAINT MATTHEWS");
    SAINT_NAME_MAP.put("ST PETERS", "SAINT PETERS");
    SAINT_NAME_MAP.put("ST ALBANS", "SAINT ALBANS");
    SAINT_NAME_MAP.put("ST FRANCISVILLE", "SAINT FRANCISVILLE");
    SAINT_NAME_MAP.put("ST MARKS", "SAINT MARKS");
    SAINT_NAME_MAP.put("ST JOHNSVILLE", "SAINT JOHNSVILLE");
    SAINT_NAME_MAP.put("ST JOSEPH", "SAINT JOSEPH");
    SAINT_NAME_MAP.put("ST JOSEPH", "SAINT JOSEPH");
    SAINT_NAME_MAP.put("ST MAURICE", "SAINT MAURICE");
    SAINT_NAME_MAP.put("ST DONATUS", "SAINT DONATUS");
    SAINT_NAME_MAP.put("ST IGNACE", "SAINT IGNACE");
    SAINT_NAME_MAP.put("ST HELENA", "SAINT HELENA");
    SAINT_NAME_MAP.put("ST OLAF", "SAINT OLAF");
    SAINT_NAME_MAP.put("ST IGNATIUS", "SAINT IGNATIUS");
    SAINT_NAME_MAP.put("ST JAMES", "SAINT JAMES");
    SAINT_NAME_MAP.put("ST ALBANS", "SAINT ALBANS");
    SAINT_NAME_MAP.put("ST ROBERT", "SAINT ROBERT");
    SAINT_NAME_MAP.put("ST STEPHENS CHURCH", "SAINT STEPHENS CHURCH");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST JOHNS", "SAINT JOHNS");
    SAINT_NAME_MAP.put("ST LIBORY", "SAINT LIBORY");
    SAINT_NAME_MAP.put("ST AGATHA", "SAINT AGATHA");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST MARIES", "SAINT MARIES");
    SAINT_NAME_MAP.put("ST MICHAELS", "SAINT MICHAELS");
    SAINT_NAME_MAP.put("ST ANTHONY", "SAINT ANTHONY");
    SAINT_NAME_MAP.put("ST LIBORY", "SAINT LIBORY");
    SAINT_NAME_MAP.put("ST HELEN", "SAINT HELEN");
    SAINT_NAME_MAP.put("ST CROIX FALLS", "SAINT CROIX FALLS");
    SAINT_NAME_MAP.put("ST REGIS FALLS", "SAINT REGIS FALLS");
    SAINT_NAME_MAP.put("ST LOUIS", "SAINT LOUIS");
    SAINT_NAME_MAP.put("ST HELENA ISLAND", "SAINT HELENA ISLAND");
    SAINT_NAME_MAP.put("ST STEPHENS", "SAINT STEPHENS");
    SAINT_NAME_MAP.put("ST MARYS CITY", "SAINT MARYS CITY");
    SAINT_NAME_MAP.put("ST PAUL ISLAND", "SAINT PAUL ISLAND");
    SAINT_NAME_MAP.put("ST MICHAEL", "SAINT MICHAEL");
    SAINT_NAME_MAP.put("ST ELMO", "SAINT ELMO");
    SAINT_NAME_MAP.put("ST THOMAS", "SAINT THOMAS");
    SAINT_NAME_MAP.put("ST JOE", "SAINT JOE");
    SAINT_NAME_MAP.put("ST AUGUSTINE", "SAINT AUGUSTINE");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST CLAIR SHORES", "SAINT CLAIR SHORES");
    SAINT_NAME_MAP.put("ST MARTIN", "SAINT MARTIN");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST FRANCISVILLE", "SAINT FRANCISVILLE");
    SAINT_NAME_MAP.put("ST SIMONS ISLAND", "SAINT SIMONS ISLAND");
    SAINT_NAME_MAP.put("ST JOHN", "SAINT JOHN");
    SAINT_NAME_MAP.put("ST STEPHENS", "SAINT STEPHENS");
    SAINT_NAME_MAP.put("ST LUCAS", "SAINT LUCAS");
    SAINT_NAME_MAP.put("ST GABRIEL", "SAINT GABRIEL");
    SAINT_NAME_MAP.put("ST AMANT", "SAINT AMANT");
    SAINT_NAME_MAP.put("ST MICHAEL", "SAINT MICHAEL");
    SAINT_NAME_MAP.put("ST CLOUD", "SAINT CLOUD");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST CROIX", "SAINT CROIX");
    SAINT_NAME_MAP.put("ST GEORGE", "SAINT GEORGE");
    SAINT_NAME_MAP.put("ST THOMAS", "SAINT THOMAS");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST LOUIS", "SAINT LOUIS");
    SAINT_NAME_MAP.put("ST JOSEPH", "SAINT JOSEPH");
    SAINT_NAME_MAP.put("ST CLOUD", "SAINT CLOUD");
    SAINT_NAME_MAP.put("ST BERNICE", "SAINT BERNICE");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST JAMES", "SAINT JAMES");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST LOUIS", "SAINT LOUIS");
    SAINT_NAME_MAP.put("ST LANDRY", "SAINT LANDRY");
    SAINT_NAME_MAP.put("ST HELENS", "SAINT HELENS");
    SAINT_NAME_MAP.put("ST JO", "SAINT JO");
    SAINT_NAME_MAP.put("ST BERNARD", "SAINT BERNARD");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST JOHNSBURY CENTER", "SAINT JOHNSBURY CENTER");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST VINCENT", "SAINT VINCENT");
    SAINT_NAME_MAP.put("ST STEPHEN", "SAINT STEPHEN");
    SAINT_NAME_MAP.put("ST REGIS", "SAINT REGIS");
    SAINT_NAME_MAP.put("ST JUST CONTRACT", "SAINT JUST CONTRACT");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST PETER", "SAINT PETER");
    SAINT_NAME_MAP.put("ST ELMO", "SAINT ELMO");
    SAINT_NAME_MAP.put("ST GEORGE ISLAND", "SAINT GEORGE ISLAND");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST INIGOES", "SAINT INIGOES");
    SAINT_NAME_MAP.put("ST GEORGE", "SAINT GEORGE");
    SAINT_NAME_MAP.put("ST FRANCIS", "SAINT FRANCIS");
    SAINT_NAME_MAP.put("ST BONAVENTURE", "SAINT BONAVENTURE");
    SAINT_NAME_MAP.put("ST LEONARD", "SAINT LEONARD");
    SAINT_NAME_MAP.put("ST BONIFACE", "SAINT BONIFACE");
    SAINT_NAME_MAP.put("ST CLAIRSVILLE", "SAINT CLAIRSVILLE");
    SAINT_NAME_MAP.put("ST FRANCIS", "SAINT FRANCIS");
    SAINT_NAME_MAP.put("ST ELIZABETH", "SAINT ELIZABETH");
    SAINT_NAME_MAP.put("ST JAMES CITY", "SAINT JAMES CITY");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST ANTHONY", "SAINT ANTHONY");
    SAINT_NAME_MAP.put("ST JOHNS", "SAINT JOHNS");
    SAINT_NAME_MAP.put("ST JOHN", "SAINT JOHN");
    SAINT_NAME_MAP.put("ST CLAIR", "SAINT CLAIR");
    SAINT_NAME_MAP.put("ST ANTHONY", "SAINT ANTHONY");
    SAINT_NAME_MAP.put("ST HELENA", "SAINT HELENA");
    SAINT_NAME_MAP.put("ST ALBANS BAY", "SAINT ALBANS BAY");
    SAINT_NAME_MAP.put("ST PETERSBURG", "SAINT PETERSBURG");
    SAINT_NAME_MAP.put("ST ANTHONY", "SAINT ANTHONY");
    SAINT_NAME_MAP.put("ST CLAIR", "SAINT CLAIR");
    SAINT_NAME_MAP.put("ST CLAIR", "SAINT CLAIR");
    SAINT_NAME_MAP.put("ST FRANCIS", "SAINT FRANCIS");
    SAINT_NAME_MAP.put("ST HILAIRE", "SAINT HILAIRE");
    SAINT_NAME_MAP.put("ST XAVIER", "SAINT XAVIER");
    SAINT_NAME_MAP.put("ST PETERSBURG", "SAINT PETERSBURG");
    SAINT_NAME_MAP.put("ST BENEDICT", "SAINT BENEDICT");
    SAINT_NAME_MAP.put("ST DAVID", "SAINT DAVID");
    SAINT_NAME_MAP.put("ST JOHNSBURY", "SAINT JOHNSBURY");
    SAINT_NAME_MAP.put("ST NAZIANZ", "SAINT NAZIANZ");
    SAINT_NAME_MAP.put("ST FRANCIS", "SAINT FRANCIS");
    SAINT_NAME_MAP.put("ST MICHAELS", "SAINT MICHAELS");
    SAINT_NAME_MAP.put("ST ANN", "SAINT ANN");
    SAINT_NAME_MAP.put("ST JACOB", "SAINT JACOB");
    SAINT_NAME_MAP.put("ST JAMES", "SAINT JAMES");
    SAINT_NAME_MAP.put("ST CLAIR", "SAINT CLAIR");
    SAINT_NAME_MAP.put("ST HELENS", "SAINT HELENS");
    SAINT_NAME_MAP.put("ST JOSEPH", "SAINT JOSEPH");
    SAINT_NAME_MAP.put("ST JOHN", "SAINT JOHN");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST EDWARD", "SAINT EDWARD");
    SAINT_NAME_MAP.put("ST ROSE", "SAINT ROSE");
    SAINT_NAME_MAP.put("ST JOE", "SAINT JOE");
    SAINT_NAME_MAP.put("ST JOHNS", "SAINT JOHNS");
    SAINT_NAME_MAP.put("ST MEINRAD", "SAINT MEINRAD");
    SAINT_NAME_MAP.put("ST GEORGE", "SAINT GEORGE");
    SAINT_NAME_MAP.put("ST FRANCIS", "SAINT FRANCIS");
    SAINT_NAME_MAP.put("ST GERMAIN", "SAINT GERMAIN");
    SAINT_NAME_MAP.put("ST FRANCIS", "SAINT FRANCIS");
    SAINT_NAME_MAP.put("ST PAULS", "SAINT PAULS");
    SAINT_NAME_MAP.put("ST GEORGES", "SAINT GEORGES");
    SAINT_NAME_MAP.put("ST CLOUD", "SAINT CLOUD");
    SAINT_NAME_MAP.put("ST ONGE", "SAINT ONGE");
    SAINT_NAME_MAP.put("ST ALBANS", "SAINT ALBANS");
    SAINT_NAME_MAP.put("ST STEPHEN", "SAINT STEPHEN");
    SAINT_NAME_MAP.put("ST MARY OF THE WOODS", "SAINT MARY OF THE WOODS");
    SAINT_NAME_MAP.put("ST ANDREWS", "SAINT ANDREWS");
    SAINT_NAME_MAP.put("ST LEO", "SAINT LEO");
    SAINT_NAME_MAP.put("ST MARY", "SAINT MARY");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST VRAIN", "SAINT VRAIN");
    SAINT_NAME_MAP.put("ST PETERS", "SAINT PETERS");
    SAINT_NAME_MAP.put("ST BETHLEHEM", "SAINT BETHLEHEM");
    SAINT_NAME_MAP.put("ST MICHAEL", "SAINT MICHAEL");
    SAINT_NAME_MAP.put("ST DAVID", "SAINT DAVID");
    SAINT_NAME_MAP.put("ST JOHNS", "SAINT JOHNS");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST MARIE", "SAINT MARIE");
    SAINT_NAME_MAP.put("ST MARY", "SAINT MARY");
    SAINT_NAME_MAP.put("ST JOSEPH", "SAINT JOSEPH");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST CHARLES", "SAINT CHARLES");
    SAINT_NAME_MAP.put("ST PETER", "SAINT PETER");
    SAINT_NAME_MAP.put("ST ANNE", "SAINT ANNE");
    SAINT_NAME_MAP.put("ST AUGUSTINE", "SAINT AUGUSTINE");
    SAINT_NAME_MAP.put("ST ALBANS", "SAINT ALBANS");
    SAINT_NAME_MAP.put("ST BONIFACIUS", "SAINT BONIFACIUS");
    SAINT_NAME_MAP.put("ST MARTINVILLE", "SAINT MARTINVILLE");
    SAINT_NAME_MAP.put("ST MARYS", "SAINT MARYS");
    SAINT_NAME_MAP.put("ST PATRICK", "SAINT PATRICK");
    SAINT_NAME_MAP.put("ST CATHARINE", "SAINT CATHARINE");
    SAINT_NAME_MAP.put("ST ANDREWS", "SAINT ANDREWS");
    SAINT_NAME_MAP.put("ST BERNARD", "SAINT BERNARD");
    SAINT_NAME_MAP.put("ST CHRISTOPHER", "SAINT CHRISTOPHER");
    SAINT_NAME_MAP.put("ST DENIS", "SAINT DENIS");
    SAINT_NAME_MAP.put("ST JAMES", "SAINT JAMES");
    SAINT_NAME_MAP.put("ST JOSEPHS", "SAINT JOSEPHS");
    SAINT_NAME_MAP.put("ST LUKE", "SAINT LUKE");
    SAINT_NAME_MAP.put("ST MARKS", "SAINT MARKS");
    SAINT_NAME_MAP.put("ST PAUL", "SAINT PAUL");
    SAINT_NAME_MAP.put("ST COLUMBANS", "SAINT COLUMBANS");
  }

  public static Map<String, String> getDIRECTIONAL_MAP()
  {
    return DIRECTIONAL_MAP;
  }
  public static Map<String, String> getSTREET_TYPE_MAP() {
    return STREET_TYPE_MAP;
  }
  public static Map<String, String> getCOUNTIES_MAP() {
    return COUNTIES_MAP;
  }
  public static Map<String, String> getUNIT_MAP() {
    return UNIT_MAP;
  }
  public static Map<String, String> getNUMBER_MAP() {
    return NUMBER_MAP;
  }

  public static Map<String, String> getSAINT_NAME_MAP() {
    return SAINT_NAME_MAP;
  }

  public static Map<String, String> getORDINAL_MAP() {
    return ORDINAL_MAP;
  }
}