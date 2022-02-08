package algorithms.string;

public class LicenseKeyFormatting {
    public static void main(String[] args) {

        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 4));
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 3));
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 2));
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 1));
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("211-2e-9-w1", 2));
        System.out.println(licenseKeyFormatting("r", 1));
        System.out.println(licenseKeyFormatting("AAAAAA", 2));
        System.out.println(licenseKeyFormatting("12345678", 4));
        System.out.println(licenseKeyFormatting("2", 2));

    }

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder sb = new StringBuilder();
        String s1 = s.replaceAll("-", "");
        int d = s1.length()/k;
        int c = d * k;
        int v = s1.length()-c;

        if (v!=0) {
            sb.append(s1.substring(0,v).toUpperCase());
            if (s1.substring(0,v).length() < s1.length()) {
                sb.append("-");
            }
        }

        String substring = s1.substring(v);
        for (int i = 0; i < substring.length(); i+=k) {
            String substring1 = substring.substring(i, i + k);
            sb.append(substring1.toUpperCase());
            if (i < substring.length()-k) {
                sb.append("-");
            }

        }

        return sb.toString();

    }
}
