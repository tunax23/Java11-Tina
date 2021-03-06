/*
 * Pr6_3.java
 * 
 * Copyright 2021 Tina Chen <ChenTina@10-72-120-211.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Pr6_3 {
	
	public static String spaces(int n)
	{
		String spaces = "";
		for (int i = 0; i < n; i++)
		    spaces = spaces + " ";
		return spaces;
	}
	
	public static String stars(int n)
	{
		String stars = "";
		for (int i = 0; i < n; i++)
		    stars = stars + "< ";
		return stars;
	}
	
	public static void main (String[] args) 
	{
		int num = IBIO.inputInt("Enter the number of lines: ");
		String aa = stars(num);
		
		for (int i = num-1; i > 0; i--)
		{
			if( i == 1)
			{
				System.out.println(stars(10 + num));
			}
			else
			{
				System.out.println(spaces(i) + aa);
		    }
		}
		
		//System.out.println(stars(10));
		
		for (int i = 1; i < num; i++)
		{
			if(i == 1)
			{
				System.out.println(stars(10 + num));
			}
			else
			{
			    System.out.println(spaces(i) + aa );
			}
		}
	}
}

